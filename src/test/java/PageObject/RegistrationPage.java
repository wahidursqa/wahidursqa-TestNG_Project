package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utilities.ElementActions;

public class RegistrationPage {
    private WebDriver driver;

    // Constructor to initialize the WebDriver
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    public static By Registerbtn = By.xpath("//a[normalize-space()='Register']");
    public static By genderMaleRadio = By.xpath("//input[@id='gender-male']");
    public static By genderFemaleRadio = By.xpath("//span[@class='female']");
    public static By firstNameField = By.xpath("//input[@id='FirstName']");
    public static By lastNameField = By.xpath("//input[@id='LastName']");
    public static By dayDropdown = By.xpath("//select[@name='DateOfBirthDay']");
    public static By monthDropdown = By.xpath("//select[@name='DateOfBirthMonth']");
    public static By yearDropdown = By.xpath("//select[@name='DateOfBirthYear']");
    public static By emailField = By.xpath("//input[@id='Email']");
    public static By companyNameField = By.xpath("//input[@id='Company']");
    public static By newsletterCheckbox = By.xpath("//input[@id='Newsletter']");
    public static By passwordField = By.xpath("//input[@id='Password']");
    public static By confirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    public static By registerButton = By.xpath("//button[@id='register-button']");
    public static By registrationResult = By.xpath("//div[@class='result']");

    // Actions
    public void clickRegisterbtn() {
        driver.findElement(Registerbtn).click();
    }
    
    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            driver.findElement(genderMaleRadio).click();
        } else if (gender.equalsIgnoreCase("Female")) {
            driver.findElement(genderFemaleRadio).click();
        }
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        Select dayDropdownSelect = new Select(driver.findElement(dayDropdown));
        dayDropdownSelect.selectByVisibleText(day);

        Select monthDropdownSelect = new Select(driver.findElement(monthDropdown));
        monthDropdownSelect.selectByVisibleText(month);

        Select yearDropdownSelect = new Select(driver.findElement(yearDropdown));
        yearDropdownSelect.selectByVisibleText(year);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterCompanyName(String companyName) {
        driver.findElement(companyNameField).sendKeys(companyName);
    }

    public void setNewsletterStatus(boolean checked) {
        WebElement newsletterCheckboxElement = driver.findElement(newsletterCheckbox);
        if ((checked && !newsletterCheckboxElement.isSelected()) || (!checked && newsletterCheckboxElement.isSelected())) {
            newsletterCheckboxElement.click();
        }
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }

    public String getRegistrationResultText() {
        return driver.findElement(registrationResult).getText();
    }
}
