package synchronization;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		int count=0;
		while(count<20)
			try
		{
				element.click();
		}
		catch (Exception e) {
			Thread.sleep(1000);
			count++;
		}
	}

}
