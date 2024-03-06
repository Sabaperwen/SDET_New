package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitTry {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(200));
		wait.ignoring(NoAlertPresentException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

}
