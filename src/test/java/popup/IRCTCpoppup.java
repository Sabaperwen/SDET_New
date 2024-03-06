package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCpoppup {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[.=' BUSES ']")).click();
//		System.out.println(driver.getWindowHandles());
		Set<String> allWindow = driver.getWindowHandles();
		for( String window:allWindow)
		{
		driver.switchTo().window(window);
		}
		String Expectedtitle = driver.getTitle();
		String actualTitle = "IRCTC Bus";
		if(Expectedtitle.contains(actualTitle)) {
			driver.findElement(By.id("departFrom")).sendKeys("bangal",Keys.ADD );
			driver.findElement(By.id("goingTo")).sendKeys("Ranchi");
 		}
		
	

	}

}
