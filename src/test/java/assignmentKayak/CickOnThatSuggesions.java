package assignmentKayak;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CickOnThatSuggesions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mob");
		driver.findElement(By.xpath("//div[.='mobile stand']")).click();
		
	}

}
