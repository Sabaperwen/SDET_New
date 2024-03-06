package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.findElement(By.id("buttonAlert1")).click();
		Alert alerts = driver.switchTo().alert();
		alerts.sendKeys("yes");
		Thread.sleep(1000);
		alerts.accept();
		WebElement notify = driver.findElement(By.xpath("//p[.='You selected yes']"));
//		if(notify.isDisplayed())
//		{
//			System.out.println(" yes, it is selected");
//		}
//		else
//		{
//			System.out.println(" No, it is not selected");
//		}
//		
		
		String ActualResult = notify.getText();
		String expectedResult="You selected yes";
		if(expectedResult.equals(ActualResult))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
	}

}
