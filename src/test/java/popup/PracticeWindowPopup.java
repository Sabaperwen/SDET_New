package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PracticeWindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid)
		{
			driver.switchTo().window(id);
		}
		String ExpectedTitle="Selenium";
		String ActualTitle=driver.getTitle();
		if(ActualTitle.contains(ExpectedTitle))
		{
		System.out.println(driver.findElement(By.xpath("//p[text()='What you do with that power is entirely up to you.']")).getText());
		}
		
	}

}
