package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedWithMultipleIframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("saba");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		
		driver.findElement(By.id("confirm")).sendKeys("12345");
	}

}
