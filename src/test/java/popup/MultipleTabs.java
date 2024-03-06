package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		String mainWindow = driver.getWindowHandle();
		WebElement paragraph = driver.findElement(By.xpath("//p[contains(text(),'Before testing this button')]"));
		System.out.println(paragraph.getText());
		driver.findElement(By.xpath("//a[text()='Multiple Tabs']")).click();
		driver.findElement(By.id("browserButton2")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid)
		{
			driver.switchTo().window(id);
		
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("Login"))
		
		{
			break;
		}
		}
		driver.findElement(By.id("username")).sendKeys("Saba");
  driver.findElement(By.id("password")).sendKeys("12334");
  driver.findElement(By.xpath("//button[.='Login']")).click();
  
 
	}

}
