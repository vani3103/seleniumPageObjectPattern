package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox extends UIElement{

	public TextBox(WebDriver driver, By locator) {
		super(driver, locator);
	}

	public void doEnterData(String text) {
		element().sendKeys(text);
	}
}
