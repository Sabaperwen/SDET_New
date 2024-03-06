package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=2");
		Thread.sleep(2000);
//		driver.findElement(By.id("name")).sendKeys("Saba");
//		 String element = driver.findElement(By.id("name")).getAttribute("placeholder");
//		System.out.println(element);
//		Thread.sleep(2000);
//	    
//		driver.findElement(By.id("email")).sendKeys("sabaprwn12345@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#password")).sendKeys("saba123");
//
//		Thread.sleep(2000); 
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input")).sendKeys("saba");

//		driver.quit();

	}

}
