package NaviagteDifferentApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SameWindowDifferentDifferentTabWeHaveToRun {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB); 
		driver.get("https://www.amazon.in/");
		
	}

}
