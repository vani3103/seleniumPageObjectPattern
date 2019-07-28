package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIElement {

	private WebDriver driver;
	private WebDriverWait wait;
	private String id;
	private By locator;
	
	public UIElement(WebDriver driver,By locator) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 20);
		this.locator=locator;
		
	}
	protected WebElement element() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}
	/*public String  conatins(String text) {
		return element().getText();
	}*/
	
}
