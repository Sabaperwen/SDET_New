package keyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasswordAndPasteInConfirmPswrd {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=6");
	Thread.sleep(3000);
		WebElement pswrd = driver.findElement(By.id("password"));
	
	pswrd.click();
	Robot robo=new Robot();
	robo.keyPress(KeyEvent.VK_S);
	robo.keyRelease(KeyEvent.VK_S);
	
	robo.keyPress(KeyEvent.VK_A);
	robo.keyRelease(KeyEvent.VK_A);
	
	robo.keyPress(KeyEvent.VK_B);
	robo.keyRelease(KeyEvent.VK_B);
	
	robo.keyPress(KeyEvent.VK_A);
	robo.keyRelease(KeyEvent.VK_A);
	
	robo.keyPress(KeyEvent.VK_1);
	robo.keyRelease(KeyEvent.VK_1);
	
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_A);
	
	
	robo.keyPress(KeyEvent.VK_COPY);
	robo.keyRelease(KeyEvent.VK_COPY);
	
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_A);
	
//	robo.keyRelease(KeyEvent.VK_COPY);
	WebElement confrm = driver.findElement(By.id("confirmPassword"));
	confrm.click();
	robo.keyPress(KeyEvent.VK_PASTE);
	robo.keyRelease(KeyEvent.VK_PASTE);
	
	
	
	}

}
