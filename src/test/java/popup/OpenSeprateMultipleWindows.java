package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSeprateMultipleWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[.='click ']")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid)
		{
			driver.switchTo().window(id);
		}
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://demo.automationtesting.in/Index.html";
		if(ActualUrl.equals(ExpectedUrl))
		{
			driver.findElement(By.id("email")).sendKeys("sabaprwn12345@gmail.com");
		}
	}

}
