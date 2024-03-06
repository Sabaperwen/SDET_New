package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("email")).sendKeys("sabaperween");
	    driver.findElement(By.id("password")).sendKeys("12345");
	    driver.findElement(By.id("confirm-password")).sendKeys("12345");
	    driver.findElement(By.id("submitButton")).click();
		
	}

}
