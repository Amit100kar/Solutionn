package Testing_Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class automation_testing {
	
	static WebDriver driver;

	@BeforeTest
	public static void Browser_Launch() throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.saucedemo.com/");
		
		Thread.sleep(2000);

	}
	@Test(priority = 1)
	public static void HomePage_Launch() throws Exception {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
	}
	@AfterTest
	public static void Terminate() {
		driver.quit();
}
}