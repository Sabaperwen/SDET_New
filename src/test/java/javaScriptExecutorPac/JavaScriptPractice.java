package javaScriptExecutorPac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		System.out.println( js.executeScript("return document.body.scrollHeight"));
//		js.executeScript("window.scrollBy(0,6152)");
//		driver.findElement(By.linkText("France")).click();
		WebElement element = driver.findElement(By.linkText("Facebook"));
		Point loc = element.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x+" "+y);
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	
	}

}
