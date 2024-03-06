package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MicrophonePopup {

	public static void main(String[] args) {
//		to handle microphone popup we will use it
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--use-fake-ui-for-media-stream");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mictests.com/");
		driver.findElement(By.id("mic-launcher")).click();
		
	}

}
