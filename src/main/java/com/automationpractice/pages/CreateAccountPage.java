package com.automationpractice.pages;



import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "customer_firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "passwd")
    WebElement password;

    @CacheLookup
    @FindBy(id = "firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "city")
    WebElement city;

    @CacheLookup
    @FindBy(id = "id_state")
    WebElement state;

    @CacheLookup
    @FindBy(id = "id_state")
    WebElement zipcode;

    @CacheLookup
    @FindBy(id = "phone_mobile")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(id = "alias")
    WebElement reference;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement registerbtn;

    public void clickOnRegisterBtn() {
        clickOnElement(registerbtn);
        log.info("Clicking on Register button  " + registerbtn.toString());
    }

    public void enterAddress(String text) {
        sendTextToElement(address, text);
        log.info("Entering reference  " + address.toString());
    }

    public void enterCity(String text) {
        sendTextToElement(city, text);
        log.info("Entering city  " + city.toString());

    }

    public void enterZipCode(String text) {
        sendTextToElement(zipcode, text);
        log.info("Entering zip code  " + zipcode.toString());
    }

    public void enterPhoneNumber(String text) {
        sendTextToElement(phoneNumber, text);
        log.info("Entering phone number  " + phoneNumber.toString());
    }

    public void enterReference(String text) {
        sendTextToElement(reference, text);
        log.info("Entering reference  " + reference.toString());
    }

    public void selectState(String text) {
        sendTextToElement(state, text);
        log.info("Selecting state " + state.toString());
    }

    public void enterFirstName(String text) {
        sendTextToElement(firstName, text);
        log.info("Entering first name  " + firstName.toString());
    }

    public void enterLastName(String text) {
        sendTextToElement(lastName, text);
        log.info("Entering last name  " + lastName.toString());
    }

    public void enterFirstNameField(String text) {
        sendTextToElement(firstNameField, text);
        log.info("Entering first name  " + firstName.toString());
    }

    public void enterLastNameField(String text) {
        sendTextToElement(lastNameField, text);
        log.info("Entering last name  " + lastName.toString());
    }

    public void enterPassword(String text) {
        sendTextToElement(password, text);
        log.info("Entering password  " + password.toString());
    }


}
