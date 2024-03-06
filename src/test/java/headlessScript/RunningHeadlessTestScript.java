package headlessScript;

import java.lang.StackWalker.Option;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunningHeadlessTestScript {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		Thread.sleep(2000);
	}

}
