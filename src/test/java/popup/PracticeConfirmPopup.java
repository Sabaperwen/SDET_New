package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeConfirmPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.className("analystic")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert alerts = driver.switchTo().alert();
		alerts.dismiss();
		
	}

}
