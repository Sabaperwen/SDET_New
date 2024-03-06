package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(2000);
//		WebElement men = driver.findElement(By.linkText("Men"));
//		men.click();
		
		
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++)
		{
			System.out.println(alllinks.get(i).getText());
		}
		
		
		
	}

}
