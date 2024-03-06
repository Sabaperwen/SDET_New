package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformRightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement btn = driver.findElement(By.id("btn30"));
		act.contextClick(btn).perform();
	}

}
