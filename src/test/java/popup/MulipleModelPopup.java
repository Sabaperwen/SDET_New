package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulipleModelPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
		driver.findElement(By.id("multiModalButton")).click();
		driver.findElement(By.xpath("//button[@id='multiClosemodal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='close'][1]")).click();
	}

}
