package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoSites {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Saba");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Perween");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Bokaro");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sabaprwn12345@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9135476545");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.id("checkbox2")).click();
		WebElement dropdown = driver.findElement(By.id("msdd"));
		dropdown.click();
		driver.findElement(By.linkText("Hindi")).click();
		WebElement skills = driver.findElement(By.id("Skills"));
//		skills.click();
		Select select1=new Select(skills);
		select1.selectByValue("Java");
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		country.click();
		WebElement searchbar = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		searchbar.sendKeys("India",Keys.ENTER);
		Thread.sleep(2000);
		
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select select=new Select(year);
		select.selectByValue("1999");
		WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
        Select select2=new Select(month);
        select2.selectByVisibleText("February");
        WebElement day = driver.findElement(By.id("daybox"));                          
        Select select3=new Select(day);
        select3.selectByVisibleText("26");
        driver.findElement(By.id("firstpassword")).sendKeys("saba123");
        driver.findElement(By.id("secondpassword")).sendKeys("saba123");
        driver.findElement(By.id("submitbtn")).click();
//		 driver.quit();
		
		
	}

}
