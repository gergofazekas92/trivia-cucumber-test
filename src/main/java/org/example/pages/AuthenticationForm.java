package org.example.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class AuthenticationForm extends BasePage{
    @FindBy(css = "input[name='userName']")
    protected WebElement usernameInput;
    @FindBy(css = "input[name='password']")
    protected WebElement passwordInput;
    @FindBy(tagName = "p")
    protected WebElement errorMessageDisplay;

    public AuthenticationForm(WebDriver driver) {
        super(driver);
    }

    public boolean isErrorMessagePresent() {
        try {
            wait.until((ExpectedConditions.visibilityOf(errorMessageDisplay)));
            return errorMessageDisplay.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
