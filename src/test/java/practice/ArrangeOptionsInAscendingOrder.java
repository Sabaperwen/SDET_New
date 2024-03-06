package practice;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrangeOptionsInAscendingOrder {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("select1"));
		Thread.sleep(2000);
		Select select=new Select(ele);
		List<WebElement> alloptions = select.getOptions();
		ArrayList<String> a=new ArrayList<String>();
		for(WebElement option:alloptions)
		{
			a.add(option.getText());
		}

		Collections.sort(a);
		
		
		System.out.println("After Sorting Options Are:"+" "+a);

		
		
	}

}
