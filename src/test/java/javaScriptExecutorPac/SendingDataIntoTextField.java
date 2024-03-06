package javaScriptExecutorPac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingDataIntoTextField {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//		Send data into text field
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]",element ,"shoes");
		
		
//		To click on the Element
//		WebElement searchIcon = driver.findElement(By.id("nav-search-submit-button"));
//		js.executeScript("arguments[0].click()", searchIcon);
		
		
//		Click on the element by using ID
		js.executeScript("document.getElementById('nav-search-submit-button').click()");
		driver.quit();
	}

}
