package assignmentKayak;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kayak {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://www.kayak.co.in/");
		driver.findElement(By.xpath("//div[.='Flights']")).click();
//		WebElement from = driver.findElement(By.xpath("//div[.='Nagpur (NAG)']"));
		Thread.sleep(2000);
//		from.click();
		WebElement search = driver.findElement(By.xpath("//input[@class='k_my-input']"));
		search.sendKeys("bangal");
		WebElement city = driver.findElement(By.xpath("//input[@class='k_my-input' and @placeholder='To?']"));
		city.click();
		Thread.sleep(2000);
		
		WebElement to = driver.findElement(By.xpath("//input[@aria-controls='flight-destination-smarty-input-list']"));
		to.sendKeys("Ranchi");
		driver.findElement(By.xpath("//span[.='Ranchi, Jharkhand, India']")).click();
		
  		driver.findElement(By.xpath("//span[.='Fri 1/3'][1]")).click();
  		driver.findElement(By.xpath("//div[@aria-label='Sunday 31 March, 2024']")).click();
	    driver.findElement(By.xpath("//span[@aria-label='End date calendar input']")).click();
	    driver.findElement(By.xpath("//div[@aria-label='Thursday 18 April, 2024']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//div[@aria-label='Cheapest']")).click();

		
	}

}
