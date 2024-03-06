package assignmentKayak;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnThatSuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/s?k=kurti&crid=7WL2CGXBJ1QE&sprefix=kurti%2Caps%2C294&ref=nb_sb_noss_1");
		driver.findElement(By.xpath(null));
	}

}
