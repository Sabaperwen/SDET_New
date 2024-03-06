package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnYesButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		 WebElement yesBtn = driver.findElement(By.id("btn"));
		 yesBtn.click();
		 System.out.println(yesBtn.isSelected());
//		String select = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText();
	    
	}

}
