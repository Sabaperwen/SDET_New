package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleNestedIframeUsingUtility {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
     
	}

}
