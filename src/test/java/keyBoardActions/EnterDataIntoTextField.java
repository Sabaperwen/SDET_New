package keyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataIntoTextField {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		WebElement element = driver.findElement(By.id("email"));
		element.click();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_S);
		
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		
		robo.keyPress(KeyEvent.VK_B);
		robo.keyRelease(KeyEvent.VK_B);
		
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
	}

}
