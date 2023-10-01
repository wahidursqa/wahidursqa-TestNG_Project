package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import Utilities.ElementActions;

public class PlaceOrder{

    public static By eletronics_locator=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    public static By cellphones_locator=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    public static By nokialumia_locator=By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    public static By set_quantity_locator=By.xpath("//input[@id='product_enteredQuantity_20']");
    public static By addtocart_locator=By.xpath("//button[@id='add-to-cart-button-20']");
    public static By shoppingcart_locator=By.xpath("//span[@class='cart-label']");
    public static By termsofuse_locator=By.xpath("//input[@id='termsofservice']");
    public static By checkoutbutton_locator=By.xpath("//button[@id='checkout']");
    public static By checkoutguestbutton_locator=By.xpath("//button[normalize-space()='Checkout as Guest']");
    public static By firstname_locator=By.xpath("//input[@id='BillingNewAddress_FirstName']");
    public static By lastname_locator=By.xpath("//input[@id='BillingNewAddress_LastName']");
    public static By email_locator=By.xpath("//input[@id='BillingNewAddress_Email']");
    public static By country_dropdown_locator=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    public static By city_locator=By.xpath("//input[@id='BillingNewAddress_City']");
    public static By address1_locator=By.xpath("//input[@id='BillingNewAddress_Address1']");
    public static By postal_code_locator=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    public static By phone_number_locator=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    public static By continue_billing_locator=By.xpath("//button[@onclick='Billing.save()']");
    public static By nextdayair_locator=By.xpath("//input[@id='shippingoption_1']");
    public static By continue_shipping_locator=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public static By credit_card_locator=By.xpath("//input[@id='paymentmethod_1']");
    public static By continue_credit_locator=By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public static By cardholdername_locator=By.xpath("//input[@id='CardholderName']");
    public static By cardnumber_locator=By.xpath("//input[@id='CardNumber']");
    public static By carcode_locator=By.xpath("//input[@id='CardCode']");
    public static By expirationdate_locator=By.xpath("//select[@id='ExpireYear']");
    public static By continue_button_payment_locator=By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public static By checkout_confirm_locator=By.xpath("//button[normalize-space()='Confirm']");

    public static By success_message_locator=By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");

    public static void hoverElectronics() throws InterruptedException {
        ElementActions.hoverValue(eletronics_locator);
    }
    public static void clickCellphones() throws InterruptedException {
        ElementActions.clickElement(cellphones_locator);
    }
    public static void clicknokialumia() throws InterruptedException {
        ElementActions.clickElement(nokialumia_locator);
    }
    public static void set_quantity(String value) throws InterruptedException {
        ElementActions.doEnterValue(set_quantity_locator,value);
    }
    public static void clickAddtoCart() throws InterruptedException {
        ElementActions.clickElement(addtocart_locator);
    }
    public static void clickShoppingCart() throws InterruptedException {
        ElementActions.clickElement(shoppingcart_locator);
    }
    public static void clickTermsofuse() throws InterruptedException {
        ElementActions.clickElement(termsofuse_locator);
    }
    public static void clickCheckoutbutton() throws InterruptedException {
        ElementActions.clickElement(checkoutbutton_locator);
    }
    public static void clickCheckoutguestbutton() throws InterruptedException {
        ElementActions.clickElement(checkoutguestbutton_locator);
    }
    public static void setFirstname(String value) throws InterruptedException {
        ElementActions.doEnterValue(firstname_locator,value);
    }
    public static void setLastname(String value) throws InterruptedException {
        ElementActions.doEnterValue(lastname_locator,value);
    }
    public static void setEmail(String value) throws InterruptedException {
        ElementActions.doEnterValue(email_locator,value);
    }
    public static void setCountryDropdown(String value) throws InterruptedException {
        ElementActions.clickElement(country_dropdown_locator);
        Select se=new Select(ElementActions.getElement(country_dropdown_locator));
        se.selectByVisibleText(value);
    }
    public static void setCity(String value) throws InterruptedException {
        ElementActions.doEnterValue(city_locator,value);
    }
    public static void setAddress1(String value) throws InterruptedException {
        ElementActions.doEnterValue(address1_locator,value);
    }
        public static void setPostalcode(String value) throws InterruptedException {
        ElementActions.doEnterValue(postal_code_locator,value);
    }
    public static void setPhoneNumber(String value) throws InterruptedException {
        ElementActions.doEnterValue(phone_number_locator,value);
    }
    public static void clickContinueButtonBilling() throws InterruptedException {
        ElementActions.clickElement(continue_billing_locator);
    }
    public static void clickNextdayair() throws InterruptedException {
        ElementActions.clickElement(nextdayair_locator);
    }
    public static void clickContinueShipping() throws InterruptedException {
        ElementActions.clickElement(continue_shipping_locator);
    }
    public static void clickCreditCard() throws InterruptedException {
        ElementActions.clickElement(credit_card_locator);
    }
    public static void clickContinueCredit() throws InterruptedException {
        ElementActions.clickElement(continue_credit_locator);
    }
    public static void setCardholdername(String value) throws InterruptedException {
        ElementActions.doEnterValue(cardholdername_locator,value);
    }
    public static void setCardnumber(String value) throws InterruptedException {
        ElementActions.doEnterValue(cardnumber_locator,value);
    }
    public static void setCarcode(String value) throws InterruptedException {
        ElementActions.doEnterValue(carcode_locator,value);
    }
    public static void setExpirationdate(String value) throws InterruptedException {
        ElementActions.clickElement(expirationdate_locator);
        Select se=new Select(ElementActions.getElement(expirationdate_locator));
        se.selectByVisibleText(value);
    }
    public static void clickContinueButtonPayment() throws InterruptedException {
        ElementActions.clickElement(continue_button_payment_locator);
    }
    public static void clickCheckoutConfirm() throws InterruptedException {
        ElementActions.clickElement(checkout_confirm_locator);
    }
    public static String getSuccessMessage() throws InterruptedException {
        return ElementActions.getText(success_message_locator);
    }












}

