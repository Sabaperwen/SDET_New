package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPoppup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0&scenario=1");
		driver.findElement(By.id("browserLink1")).click();
		Set<String> allIds = driver.getWindowHandles();
		for( String id : allIds)
		{
			driver.switchTo().window(id);
			
		}
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="SignUpPage";
		if(ActualTitle.contains(ExpectedTitle))
		{
			WebElement email = driver.findElement(By.id("email"));
			email.click();
			email.sendKeys("sabaprwn12345@gamil.com");
		}
		
		
	}

}
