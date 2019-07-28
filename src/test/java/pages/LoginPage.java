package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import controls.Button;
import controls.TextBox;
import controls.UIElement;
import models.UserLoginDetails;

public class LoginPage {
private WebDriver driver;

private TextBox userIdTextBox() {
	return new TextBox(driver,By.id("txtUsername"));
}

private TextBox pwdTextBox() {
	return new TextBox(driver,By.id("txtPassword"));
}

private Button signInButton() {
	return new Button(driver, By.id("btnLogin"));
}
public LoginPage(WebDriver driver) {
	this.driver=driver;
}
public LoginPage open() {
	driver.get("https://opensource-demo.orangehrmlive.com/");
	return this;
}
public LoginPage doLogin(UserLoginDetails userlogindetails) {
	userIdTextBox().doEnterData(userlogindetails.getUsername() );
	pwdTextBox().doEnterData(userlogindetails.getPassword());
	signInButton().click();
	return this;
}
}
