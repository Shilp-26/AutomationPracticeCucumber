package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TshirtsPage extends Utility {

    private static final Logger log = LogManager.getLogger(TshirtsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addProductToCart;

    @CacheLookup
    @FindBy(xpath = "//a[@class='quick-view']")
    WebElement hoverProduct;

    @FindBy(className = "shopping_cart")
    WebElement cart;

    public void clickOnProduct(){
        mouseHoverToElement(hoverProduct);
        mouseHoverToElementAndClick(addProductToCart);
    }

    public void clickOnCart(){
        clickOnElement(cart);
    }

}
