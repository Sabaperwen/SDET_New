package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopups {

	public static void main(String[] args) {
  ChromeOptions option=new ChromeOptions();
  option.addArguments("--disable-notifications");
  WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
	driver.findElement(By.id("browNotButton")).click();
//	driver.quit();
	
	}

}
