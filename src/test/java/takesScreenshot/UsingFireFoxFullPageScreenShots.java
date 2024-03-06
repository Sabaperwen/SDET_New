package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class UsingFireFoxFullPageScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		File src = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("./Screenshot/img.png"));
		
		//By using firefoxDriver we can take full Page Screenshots.
	}

}
