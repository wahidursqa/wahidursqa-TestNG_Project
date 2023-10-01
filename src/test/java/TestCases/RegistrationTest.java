package TestCases;
import EnvironmentSetup.BaseEnvironment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Utilities.ElementActions;

public class RegistrationTest extends BaseEnvironment {

    @Test(dataProvider = "dataSupplier")
    public void registration_feature_test(String Gender,String dayV,String monthV,String yearV,String email,String companyName,String status,String pass,String expectedText) throws InterruptedException {
        //browse the url
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        //click the register
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        Thread.sleep(1000);
        //select male or female radio button
        if(Gender=="Male")
        {
            driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        }
        else if(Gender=="Female")
        {
            driver.findElement(By.xpath("//span[@class='female']")).click();
        }
        Thread.sleep(1000);
        //set firstname
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Al");
        Thread.sleep(1000);
        //set lastname
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Amin");
        Thread.sleep(1000);
        // day,month,year selection
        WebElement day=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Thread.sleep(1000);
        WebElement month=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Thread.sleep(1000);
        WebElement year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Thread.sleep(1000);

        day.click();
        Select se=new Select(day);
        se.selectByVisibleText(dayV);
        Thread.sleep(1000);

        month.click();
        Select se1=new Select(month);
        se1.selectByVisibleText(monthV);
        Thread.sleep(1000);

        year.click();
        Select se2=new Select(year);
        se2.selectByVisibleText(yearV);
        Thread.sleep(1000);

        // generate email randomly
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
        Thread.sleep(1000);

        //company name setup
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys(companyName);

        // set newsletter
        if(status=="checked")
        {
            driver.findElement(By.xpath("//input[@id='Newsletter']"));
        }
        else if(status=="unchecked")
        {
            driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
        }

        // password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);

        // confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(pass);

        // register button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();

        // actual text
        String actualText=driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);
    }

    @DataProvider
    public Object[][] dataSupplier()
    {

        Object[][] data ={
                {"Male","20","May","1995",ElementActions.generateEmail(),"Brainstation-23","checked","pass@1234","Your registration completed"},
                {"Female","9","May","1999",ElementActions.generateEmail(),"Brainstation-23","unchecked","pass@1234","Your registration completed"},
                {"Female","3","May","2000",ElementActions.generateEmail(),"Brainstation-23","unchecked","pass@1234","Your registration completed"},
                {"Male","2","May","2001",ElementActions.generateEmail(),"Brainstation-23","checked","pass@1234","Your registration completed"},
                {"Female","10","May","1990",ElementActions.generateEmail(),"Brainstation-23","unchecked","pass@1234","Your registration completed"}
        };
        return data;
    }
}