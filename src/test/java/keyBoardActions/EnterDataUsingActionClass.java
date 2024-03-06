package keyBoardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterDataUsingActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		WebElement element = driver.findElement(By.id("email"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
//		Pass data in uppercase
		act.sendKeys(element,"saba".toUpperCase()).perform();
		
//		Pass data in lowercase
		act.sendKeys(element,"saba".toLowerCase()).perform();
		
		
	}

}
