package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewSeprateWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid)
		{
			driver.switchTo().window(id);
		}
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.selenium.dev/";
		if(expectedUrl.equals(actualUrl))
		{
			WebElement paragraph = driver.findElement(By.xpath("//p[@class='lead mt-3 mb-0']"));
		    System.out.println(paragraph.getText());
		}
		
	}

}
