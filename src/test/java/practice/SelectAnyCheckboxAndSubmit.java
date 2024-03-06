package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectAnyCheckboxAndSubmit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		Thread.sleep(2000);
		WebElement yes = driver.findElement(By.id("sat1"));
		yes.click();
		
		WebElement submit = driver.findElement(By.id("btn40"));
		submit.click();
		
		Actions act=new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.scrollByAmount(0, 100).perform();		
	
	}

}
