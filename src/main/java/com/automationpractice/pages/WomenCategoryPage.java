package com.automationpractice.pages;


import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WomenCategoryPage extends Utility {

    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Women']")
    WebElement womenTxt;

    @FindBy(xpath = "")
    WebElement topsLink;

    @FindBy(xpath = "")
    WebElement dressesLink;

    @FindBy(xpath = "")
    WebElement sortByDropDown;

    @FindBy(xpath = "//a[@class='product-name']")
    WebElement productList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Blouse']")   //a[normalize-space()='Blouse']
    WebElement blouse;

    @CacheLookup
    @FindBy(xpath = "(//a[@title='Printed Dress'][normalize-space()='Printed Dress'])[1]")
    WebElement printedDress;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Printed Chiffon Dress']")
    WebElement priChiDress;

    @CacheLookup
    @FindBy(xpath = "(//a[@title='Printed Summer Dress'][normalize-space()='Printed Summer Dress'])[2]")
    WebElement summerDress;

    @CacheLookup
    @FindBy(linkText = "Faded Short Sleeve T-shirts")
    WebElement fadedShortSleeveTShirt;

    public void verifyWomenTxt(String text) {
        verifyThatTextIsDisplayed(womenTxt, text);

    }

    public void selectProduct(String text) {
        clickOnElement(productList, text);

    }

    public void sellProduct(String proName) {
        if (proName.equalsIgnoreCase("Blouse")) {
            clickOnElement(blouse);
            log.info("Select Product : " + proName + blouse.toString());
        } else if (proName.equalsIgnoreCase("Printed Dress")) {
            mouseHoverToElementAndClick(printedDress);
            log.info("Select Product : " + proName+ printedDress.toString());
        } else if (proName.equalsIgnoreCase("Printed Chiffon Dress")) {
            clickOnElement(priChiDress);
            log.info("Select Product : " + proName+ priChiDress.toString());
        } else if (proName.equalsIgnoreCase("Printed Summer Dress with Price $28.98")) {
            clickOnElement(summerDress);
            log.info("Select Product : " + proName+ summerDress.toString());
        } else if (proName.equalsIgnoreCase("Faded Short Sleeve T-shirts")) {
            clickOnElement(fadedShortSleeveTShirt);
        }
    }
    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@id='block_top_menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }


    }
}
