package shadowElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElementsss {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://selectorshub.com/xpath-practice-page/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement element = (WebElement)js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#kils')");
	element.sendKeys("saba");
	
//	Other way
//	WebElement ShadowElement = driver.findElement(By.xpath("//div[@id='userName']"));
//	SearchContext shadowRoot = ShadowElement.getShadowRoot();
//	shadowRoot.findElement(By.cssSelector("#kils")).sendKeys("saba");
}
}
