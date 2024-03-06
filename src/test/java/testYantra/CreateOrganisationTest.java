package testYantra;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOrganisationTest {
	@Test
	public void createOrganisation() throws InterruptedException {
		Random ran=new Random();
		int randumNum=ran.nextInt(1000);
		
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
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		WebElement organisationName = driver.findElement(By.name("accountname"));
		organisationName.sendKeys("Testyantra"+randumNum);
		WebElement ele = driver.findElement(By.name("industry"));
		ele.click();
		Select select=new Select(ele);
		select.selectByIndex(2);
		WebElement element2 = driver.findElement(By.xpath("//select[@name='accounttype']"));
		Select select2=new Select(element2);
		select2.selectByIndex(6);
		driver.findElement(By.xpath("//input[@class='crmbutton small save' and @accesskey='S']")).click();
         
//		driver.findElement(By.xpath("//img[@title='Search in Organizations...']")).click();
		String createdOrganisation = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	    if(createdOrganisation.equals(createdOrganisation))
	    {
	    	Reporter.log("test case is passed", true);
	    }
	    else {
	    	Reporter.log("test case is failed" ,false);
	    }
	    
	    //Logout The application
	    WebElement administration = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(administration).perform();
	    driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	    
	}

}
