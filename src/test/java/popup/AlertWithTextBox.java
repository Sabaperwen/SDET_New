package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[.='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alerts = driver.switchTo().alert();
		alerts.sendKeys("saba");
		alerts.accept();
	}

}
