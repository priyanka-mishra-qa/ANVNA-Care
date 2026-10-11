package anvnacare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException

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

		// Click Login button
		WebElement login = driver.findElement(By.id("navLogin"));
		login.click();

		String url2 = driver.getCurrentUrl();
		System.out.println(url2);

		Thread.sleep(3000);
		
		// Select Patient login panel
		WebElement patientPanel = driver.findElement(By.cssSelector("button[id ='patientTab']"));
		patientPanel.click();

		WebElement email = driver.findElement(By.cssSelector("input[id= 'emailInput']"));
		email.sendKeys("priyankaofficial010@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input[id= 'passwordInput']"));
		password.sendKeys("Abcd@4321");

		// Click SignIn button
		WebElement signIn = driver.findElement(By.cssSelector("button[id = 'loginButton']"));
		signIn.click();

		Thread.sleep(3000);

		String url3 = driver.getCurrentUrl();
		System.out.println(url3);

		Thread.sleep(3000);
		driver.quit();
	}

}
