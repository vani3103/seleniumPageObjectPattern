package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends UIElement {

	public Button(WebDriver driver, By locator) {
		super(driver, locator);
	}
	public void click() {
		element().click();
	}

}
