package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
	    driver.switchTo().frame(frame);
	    driver.findElement(By.id("username")).sendKeys("saba");
	    driver.findElement(By.id("password")).sendKeys("12345");
	    Thread.sleep(2000);
	    driver.findElement(By.id("submitButton")).click();
	}

}
