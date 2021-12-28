package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//i[@class='icon-trash']")
    WebElement deleteBtn;

    @FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty.')]")
    WebElement emptyMsg;

    public void verifyCartEmptyMsg(String expMsg){
        verifyThatTextIsDisplayed(emptyMsg,expMsg);
    }

    public void clickOnDeleteBtn(){
        clickOnElement(deleteBtn);
    }
}
