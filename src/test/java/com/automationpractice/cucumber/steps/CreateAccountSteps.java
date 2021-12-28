package com.automationpractice.cucumber.steps;


import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.SignInPage;
import cucumber.api.java.en.And;

public class CreateAccountSteps {
    @And("^User enters email address$")
    public void userEntersEmailAddress() {
        new SignInPage().enterEmailCreate(new SignInPage().getRandomEmail());
    }

    @And("^User clicks on create an account button$")
    public void userClicksOnCreateAnAccountButton() {
        new SignInPage().clickOnCreateAccountBtn();
    }



    @And("^User clicks on register button$")
    public void userClicksOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterBtn();
    }

    @And("^User can see the message \"([^\"]*)\" appear$")
    public void userCanSeeTheMessageAppear(String expMsg) {

    }

    @And("^User fills out all the mandatory fields: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userFillsOutAllTheMandatoryFields(String first, String last,String pass,String firstName, String lastName,String address,String city,String state,String zipCode,String number,String ref) {
        new CreateAccountPage().enterFirstName(first);
        new CreateAccountPage().enterLastName(last);
        new CreateAccountPage().enterPassword(pass);
        new CreateAccountPage().enterFirstNameField(firstName);
        new CreateAccountPage().enterLastNameField(lastName);
        new CreateAccountPage().enterAddress(address);
        new CreateAccountPage().enterCity(city);
        new CreateAccountPage().selectState(state);
        new CreateAccountPage().enterZipCode(zipCode);
        new CreateAccountPage().enterPhoneNumber(number);
        new CreateAccountPage().enterReference(ref);
    }
}
