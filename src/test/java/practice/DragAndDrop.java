package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement destination = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement source2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement LaptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement lc = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		act.dragAndDrop(source2, destination);
		WebElement laptopAccesories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(lc, laptopAccesories).perform();
		act.dragAndDrop(LaptopCharger, laptopAccesories).perform();

	}

}
