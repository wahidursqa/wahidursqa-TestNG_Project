package TestCases;
import EnvironmentSetup.BaseEnvironment;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObject.RegistrationPage;
import Utilities.ElementActions;

public class RegistrationTest2 extends BaseEnvironment {

    @Test(dataProvider = "dataSupplier")
    public void registration_feature_test(String Gender, String dayV, String monthV, String yearV, String email, String companyName, String status, String pass, String expectedText) throws InterruptedException {
        // Browse the URL
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);

        // Click the register link
        RegistrationPage registrationPage = new RegistrationPage(driver);
        Thread.sleep(1000);
        registrationPage.clickRegisterbtn();
        Thread.sleep(1000);
        registrationPage.selectGender(Gender);
        Thread.sleep(1000);
        registrationPage.enterFirstName("Wahidur");
        Thread.sleep(1000);
        registrationPage.enterLastName("Rahman");
        Thread.sleep(1000);
        registrationPage.selectDateOfBirth(dayV, monthV, yearV);
        Thread.sleep(1000);
        registrationPage.enterEmail(email);
        Thread.sleep(1000);
        registrationPage.enterCompanyName(companyName);
        Thread.sleep(1000);
        registrationPage.setNewsletterStatus(status.equalsIgnoreCase("checked"));
        Thread.sleep(1000);
        registrationPage.enterPassword(pass);
        Thread.sleep(1000);
        registrationPage.enterConfirmPassword(pass);
        Thread.sleep(1000);
        registrationPage.clickRegisterButton();
        Thread.sleep(1000);

        // Actual text
        String actualText = registrationPage.getRegistrationResultText();
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(2000);
    }

    @DataProvider
    public Object[][] dataSupplier() {
        Object[][] data = {
                {"Male", "20", "May", "1995",  ElementActions.generateEmail(), "Brainstation-23", "checked", "pass@1234", "Your registration completed"},
                {"Female", "9", "May", "1999", ElementActions.generateEmail(), "Brainstation-23", "unchecked", "pass@1234", "Your registration completed"},
                {"Female", "3", "May", "2000", ElementActions.generateEmail(), "Brainstation-23", "unchecked", "pass@1234", "Your registration completed"},
                {"Male", "2", "May", "2001",   ElementActions.generateEmail(), "Brainstation-23", "checked", "pass@1234", "Your registration completed"},
                {"Female", "10", "May", "1990",ElementActions.generateEmail(), "Brainstation-23", "unchecked", "pass@1234", "Your registration completed"}
        };
        return data;
    }
}
