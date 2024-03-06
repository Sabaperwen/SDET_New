package assignmentKayak;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//u[.='+5 colours/patterns']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//img[@class='imgSwatch']"));
		for(WebElement color: ele)
		{
			System.out.println(color.getAttribute("alt"));
		}

	}

}
