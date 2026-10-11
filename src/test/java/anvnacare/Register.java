package anvnacare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {

	public static void main(String[] args) 
	throws InterruptedException
	{
		/* Not Working
		 * WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 */ 

		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);

		driver.get("https://anvnacare.alwaysdata.net/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(3000);

		// Click Register button
		WebElement register = driver.findElement(By.id("navRegister"));
		register.click();
		
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		Thread.sleep(3000);

		WebElement name = driver.findElement(By.id("nameInput"));
		name.sendKeys("Priyanka Mishra");
		
		WebElement email = driver.findElement(By.id("emailInput"));
		email.sendKeys("priyankaofficial010@gmail.com");
		
		WebElement mobile = driver.findElement(By.id("phoneInput"));
		mobile.sendKeys("9259123456");
		
		WebElement password = driver.findElement(By.id("passwordInput"));
		password.sendKeys("Abcd@4321");
		
		Thread.sleep(3000);

		// Click Checkbox
		WebElement checkbox = driver.findElement(By.cssSelector("input[class = 'form-check-input']"));
		checkbox.click();
		
		Thread.sleep(3000);
		
		// Click Submit button
		WebElement submit = driver.findElement(By.id("registerButton"));
		submit.click();
		
		Thread.sleep(3000);
		driver.quit();
	
	}
	
}
