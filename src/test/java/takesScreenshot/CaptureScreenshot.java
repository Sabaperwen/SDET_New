package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dateAndTime=LocalDateTime.now().toString().replace(":", "-");
//	String dateAndTime=local.toString().replaceAll(":", "-").replaceAll(" ", "_");
		File destination=new File(".//Screenshot/"+dateAndTime+"pic.png");
//		FileHandler.copy(source, destination);
		Files.copy(source, destination);
		
	}

}
