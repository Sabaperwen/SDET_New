package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDesableElements {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4&scenario=1");
    WebElement submit = driver.findElement(By.id("submitButton"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
    
    
    
    
	}

}
