package testYantra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateDocumentsOnCrm {
	@Test
	public void CreateDocument() throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(1000);
	//		Enter url
	driver.get("http://localhost:8888/index.php?action=index&module=Home");

	//Login page enter user name
	driver.findElement(By.name("user_name")).sendKeys("admin");

	//Login page enter password
	driver.findElement(By.name("user_password")).sendKeys("admin");

	//Click On submit Button
	driver.findElement(By.id("submitButton")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[.='Documents']")).click();
	driver.findElement(By.xpath("//img[@alt='Create Document...']")).click();
	driver.findElement(By.xpath("//input[@name='notes_title']")).sendKeys("title");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='width:100%;height:100%']")));
	
	driver.findElement(By.xpath("//body[@class='cke_show_borders']")).sendKeys("I Am V_tiger CRM");
	driver.switchTo().defaultContent();
	WebElement ChooseFile = driver.findElement(By.xpath("//input[@name='filename_hidden']"));
	ChooseFile.click();
	ChooseFile.sendKeys("‪C:\\Users\\Saba Perween\\.lesshst");
	Robot robo=new Robot();
//	robo.keyPress(KeyEvent.VK_TAB);
//	robo.keyRelease(KeyEvent.VK_TAB);
//	
//	robo.keyPress(KeyEvent.VK_TAB);
//	robo.keyRelease(KeyEvent.VK_TAB);
//	
//	robo.keyPress(KeyEvent.VK_TAB);robo.keyRelease(KeyEvent.VK_TAB);
//	robo.keyPress(KeyEvent.VK_ENTER);
//	robo.keyRelease(KeyEvent.VK_ENTER);
	}	

}
