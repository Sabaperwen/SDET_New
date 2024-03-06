package assignmentKayak;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCticket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[.=' BUSES ']")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid)
		{
			driver.switchTo().window(id);
		}
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl="https://www.bus.irctc.co.in/home";
		if(actualUrl.equals(expectedUrl))
		{
			WebElement depart = driver.findElement(By.xpath("//input[@id='departFrom' and @name='departFrom']"));
			depart.click();
			Thread.sleep(3000);
			depart.sendKeys("bangal");
//			driver.findElement(By.id("ui-id-9")).click();
			driver.findElement(By.xpath("//div[.='Bangalore Intl Airport']")).click();
			WebElement goingTo = driver.findElement(By.xpath("//input[@id='goingTo' and @name='goingTo']"));
		    goingTo.click();
		    goingTo.sendKeys("mys");
		    driver.findElement(By.xpath("//div[.='Mysore']")).click();
		    driver.findElement(By.xpath("//input[@id='departDate' and @name='departDate']")).click();
		    driver.findElement(By.xpath("//a[.='21']")).click();
		    driver.findElement(By.xpath("//button[.='Search Bus ']")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//label[.='After 6 pm']")).click();
		    
		   
		}
	}

}
