package testyantraProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vtiger {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("http://rmgtestingserver:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("Testyantra Software");
		WebElement ele = driver.findElement(By.name("industry"));
		ele.click();
		Select select=new Select(ele);
		select.selectByIndex(2);
		WebElement element2 = driver.findElement(By.xpath("//select[@name='accounttype']"));
		Select select2=new Select(element2);
		select2.selectByIndex(6);
		driver.findElement(By.xpath("//input[@class='crmbutton small save' and @accesskey='S']")).click();
	}

}
