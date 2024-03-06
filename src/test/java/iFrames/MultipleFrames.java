package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		driver.findElement(By.id("email")).sendKeys("saba");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("confirm-password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("saba");
		driver.findElement(By.id("password")).sendKeys("12345");
	}

}
