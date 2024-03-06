package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTwoCountry {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);// . indicates text() means instead of text()we can write dot also
		WebElement dropdown = driver.findElement(By.xpath("//label[.='Country']/..//select"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("India");
		select.selectByValue("United Kingdom");
		
		
		
	}

}
