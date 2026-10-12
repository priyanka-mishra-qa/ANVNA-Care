package anvnacare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException
	{

        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://anvnacare.alwaysdata.net/");
        
        String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();
        System.out.println(url);

        Thread.sleep(2000);

        // Click Login button
        WebElement login = driver.findElement(By.id("navLogin"));
        login.click();

        String url2 = driver.getCurrentUrl();
        System.out.println(url2);

        Thread.sleep(3000);

        // Select Patient login panel
        WebElement patientPanel = driver.findElement(By.cssSelector("button[id='patientTab']"));
        patientPanel.click();

        WebElement email = driver.findElement(By.cssSelector("input[id='emailInput']"));
        email.sendKeys("priyankaofficial010@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id='passwordInput']"));
        password.sendKeys("Abcd@4321");

        // Click SignIn button
        WebElement signIn = driver.findElement(By.cssSelector("button[id='loginButton']"));
        signIn.click();

        String url3 = driver.getCurrentUrl();
        System.out.println(url3);

        Thread.sleep(2000);

        // Open Pharmacy section
        WebElement pharmacy = driver.findElement(By.cssSelector("a[id='navPharmacy']"));
        pharmacy.click();

        String url4 = driver.getCurrentUrl();
        System.out.println(url4);

        Thread.sleep(1000);

        // Open Pantoprazole 40mg medicine
        WebElement med1 = driver.findElement(By.partialLinkText("Pantoprazole 40mg"));
        med1.click();

        String url5 = driver.getCurrentUrl();
        System.out.println(url5);

        Thread.sleep(1000);

        // Add medicine to cart
        WebElement add1 = driver.findElement(By.id("addToCartBtn"));
        add1.click();

        Thread.sleep(3000);

        // Return
        WebElement back1 = driver.findElement(By.xpath("//a[@id='backToMeds']"));
        back1.click();

        String url6 = driver.getCurrentUrl();
        System.out.println(url6);

        Thread.sleep(1000);

        // Open Atorvastatin 10mg medicine
        WebElement med2 = driver.findElement(By.partialLinkText("Atorvastatin 10mg"));
        med2.click();

        String url7 = driver.getCurrentUrl();
        System.out.println(url7);

        Thread.sleep(1000);

        // Add medicine to cart
        WebElement add2 = driver.findElement(By.id("addToCartBtn"));
        add2.click();

        Thread.sleep(3000);

        // Return
        WebElement back2 = driver.findElement(By.xpath("//a[@id='backToMeds']"));
        back2.click();

        Thread.sleep(1000);

        // Open Lab Test section
        WebElement diagnostics = driver.findElement(By.cssSelector("a[id='navDiagnostics']"));
        diagnostics.click();

        String url8 = driver.getCurrentUrl();
        System.out.println(url8);

        Thread.sleep(1000);

        driver.findElement(By.id("test-name-16"));

        // Book Test
        WebElement test1 = driver.findElement(By.id("bookTestBtn-16"));
        test1.click();

        Thread.sleep(3000);

        // Open the shopping cart
        WebElement cart = driver.findElement(By.cssSelector("i[class='bi bi-cart3 fs-4 text-success']"));
        cart.click();

        Thread.sleep(1000);

        String url9 = driver.getCurrentUrl();
        System.out.println(url9);

        Thread.sleep(1000);

        WebElement total1 = driver.findElement(By.cssSelector("strong[id='summaryTotal']"));
        System.out.println("Total Before Applying Coupon : " + total1.getText());

        WebElement coupon = driver.findElement(By.cssSelector("input[id='couponInput']"));
        coupon.sendKeys("WELCOME");

        // Apply Coupon
        WebElement apply = driver.findElement(By.id("applyCouponBtn"));
        apply.click();

        Thread.sleep(1000);

        WebElement discount = driver.findElement(By.cssSelector("strong[id='summaryDiscount']"));
        System.out.println("Total Coupon Discount : " + discount.getText());

        WebElement total2 = driver.findElement(By.cssSelector("strong[id='summaryTotal']"));
        System.out.println("Total After Applying Coupon : " + total2.getText());
        
        // Wait for the coupon success banner to disappear
     	Thread.sleep(5000);

     	// Proceed to Checkout
     	WebElement checkout = driver.findElement(By.id("checkoutBtn"));
     	checkout.click();

     	Thread.sleep(2000);

        String url10 = driver.getCurrentUrl();
        System.out.println(url10);

        Thread.sleep(1000);

        // Add New Address
        /*WebElement newAddress = driver.findElement(By.id("addNewAddressBtn"));
        newAddress.click();
        
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.id("modalAddressName"));
        name.sendKeys("Priyanka Mishra");

        WebElement phone = driver.findElement(By.id("modalAddressPhone"));
        phone.sendKeys("9259123456");

        WebElement address1 = driver.findElement(By.name("address_line1"));
        address1.sendKeys("Indirapuram");
        
        WebElement address2 = driver.findElement(By.name("address_line2"));
        address2.sendKeys("Ghaziabad");
        
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Noida");

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Uttar Pradesh");
        
        WebElement pincode = driver.findElement(By.name("pincode"));
        pincode.sendKeys("201015");
        
        Thread.sleep(2000);
        
        // Save Delivery Address
     	WebElement address = driver.findElement(By.id("saveAddressBtn"));
     	address.click();
     	*/
     	
     	Thread.sleep(1000);
     			
     	WebElement select = driver.findElement(By.cssSelector("div[id='address-card-244']"));
     	select.click();
     	
     	Thread.sleep(1000);
     	
     	WebElement next1 = driver.findElement(By.id("nextToDeliveryBtn"));
        next1.click();
        
        // Choose Delivery Option
        WebElement express = driver.findElement(By.id("deliveryExpress"));
        express.click();
        
        WebElement next2 = driver.findElement(By.id("nextToReviewBtn"));
        next2.click();
        
        // Review Your Order
        WebElement next3 = driver.findElement(By.id("nextToPaymentBtn"));
        next3.click();
        
        // Payment Details
        WebElement cardNum = driver.findElement(By.id("cardNumber"));
        cardNum.sendKeys("4111 1111 1111 1111");
        
        WebElement cardExpiry = driver.findElement(By.id("cardExpiry"));
        cardExpiry.sendKeys("12/30");
        
        WebElement cardCvv = driver.findElement(By.id("cardCvv"));
        cardCvv.sendKeys("123");
        
        WebElement pay = driver.findElement(By.id("payNowBtn"));
        pay.click();
        
        Thread.sleep(2000);

        WebElement otp = driver.findElement(By.id("otpInput"));
        otp.sendKeys("123456");
        
        // Verify & Complete Order
        WebElement verify = driver.findElement(By.xpath("//span[text() = 'Verify & Complete Order'] "));
        verify.click();
        
        Thread.sleep(2000);
        
        // Order Placed Successfully
        WebElement orderNo = driver.findElement(By.cssSelector("strong[id='summaryDiscount']"));
        System.out.println("Order Number : " + orderNo.getText());

        WebElement amountPaid = driver.findElement(By.cssSelector("strong[id='summaryTotal']"));
        System.out.println("Amount Paid : " + amountPaid.getText());
        
        Thread.sleep(2000);
        
        // My Order
        WebElement myOrder = driver.findElement(By.cssSelector("a[id='successOrdersBtn']"));
        myOrder.click();
        
        String url11 = driver.getCurrentUrl();
        System.out.println(url11);
        
        Thread.sleep(3000);
        driver.quit();
    }	
}