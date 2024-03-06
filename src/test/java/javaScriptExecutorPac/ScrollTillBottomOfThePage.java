package javaScriptExecutorPac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillBottomOfThePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		
//		Thread.sleep(1000);
////		Again it will scroll up means top of the page
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		driver.quit();
		
		
//		ScrollTillElement
		WebElement element = driver.findElement(By.linkText("France"));

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		

	}

}
