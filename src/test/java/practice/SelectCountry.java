package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCountry {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("select3"));
		Select select=new Select(dropdown);
		select.selectByIndex(4);
		List<WebElement> alloptions = select.getOptions();
//		for(int i=0;i<alloptions.size();i++)
//		{
//		System.out.println(alloptions.get(i).getText());
//		}
		
		
		for(WebElement web: alloptions)
		{
			System.out.println(web.getText());
		}
	driver.quit();
	}

}
