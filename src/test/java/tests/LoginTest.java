package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import models.UserLoginDetails;
import pages.LoginPage;

public class LoginTest {
	private static WebDriver driver;
	private static WebDriverWait wait;
@BeforeTest
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "D:/selenium libraries/Jan 2018/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
}
@AfterTest
public void tearDown() {
	driver.quit();
	driver.close();
}
@Test
public void doSuccessfulLogin() {
	new LoginPage(driver).open().doLogin(UserLoginDetails.valid_User_details);
	
}
}
