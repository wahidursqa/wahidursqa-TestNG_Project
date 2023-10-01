package TestCases;
import EnvironmentSetup.BaseEnvironment;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.PlaceOrder;

public class PlaceOrderTest extends BaseEnvironment {
    @Test
    public void place_order_test() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        PlaceOrder.hoverElectronics();
        Thread.sleep(1000);
        PlaceOrder.clickCellphones();
        Thread.sleep(1000);
        PlaceOrder.clicknokialumia();
        Thread.sleep(1000);
        PlaceOrder.set_quantity("2");
        Thread.sleep(1000);
        PlaceOrder.clickAddtoCart();
        Thread.sleep(5000);
        PlaceOrder.clickShoppingCart();
        Thread.sleep(1000);
        PlaceOrder.clickTermsofuse();
        Thread.sleep(1000);
        PlaceOrder.clickCheckoutbutton();
        Thread.sleep(1000);
        PlaceOrder.clickCheckoutguestbutton();
        Thread.sleep(1000);
        PlaceOrder.setFirstname("Wahidur");
        Thread.sleep(1000);
        PlaceOrder.setLastname("Rahman");
        Thread.sleep(1000);
        PlaceOrder.setEmail("wahidursqa@gmail.com");
        Thread.sleep(1000);
        PlaceOrder.setCountryDropdown("Bangladesh");
        Thread.sleep(1000);
        PlaceOrder.setCity("Dhaka");
        Thread.sleep(1000);
        PlaceOrder.setAddress1("Jatrabari");
        Thread.sleep(1000);
        PlaceOrder.setPostalcode("1362");
        Thread.sleep(1000);
        PlaceOrder.setPhoneNumber("01953728815");
        Thread.sleep(1000);
        PlaceOrder.clickContinueButtonBilling();
        Thread.sleep(1000);
        PlaceOrder.clickNextdayair();
        Thread.sleep(1000);
        PlaceOrder.clickContinueShipping();
        Thread.sleep(1000);
        PlaceOrder.clickCreditCard();
        Thread.sleep(1000);
        PlaceOrder.clickContinueCredit();
        Thread.sleep(1000);
        PlaceOrder.setCardholdername("Al-Amin");
        Thread.sleep(1000);
        PlaceOrder.setCardnumber("4706612229464269");
        Thread.sleep(1000);
        PlaceOrder.setCarcode("899");
        Thread.sleep(1000);
        PlaceOrder.setExpirationdate("2025");
        Thread.sleep(1000);
        PlaceOrder.clickContinueButtonPayment();
        Thread.sleep(1000);
        PlaceOrder.clickCheckoutConfirm();
        Thread.sleep(1000);
        String actualMessage= PlaceOrder.getSuccessMessage();
        String expectedMessage="Your order has been successfully processed!";
        Assert.assertEquals(actualMessage,expectedMessage);




    }
}