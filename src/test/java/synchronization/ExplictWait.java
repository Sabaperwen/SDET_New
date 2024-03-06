package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.titleContains(null));
		wait.until(ExpectedConditions.urlContains(null));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

}
