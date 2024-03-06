package testYantra;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactsTest {

	@Test
	public void createContact() throws InterruptedException {
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

		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		String first="Saba";
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
	    firstName.sendKeys(first);
	    
	    String last="Perween";
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(last);
		String mainWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		for(String window:allwindow)
		{
			driver.switchTo().window(window);
		}
		String organisationNme="Testyantra307";
		WebElement tyss = driver.findElement(By.xpath("//a[@href='javascript:window.close();' and @id='3']"));
		
		if(tyss.getText().equals(organisationNme))
		{
			tyss.click();
		}
		
		 driver.switchTo().window(mainWindow);

		driver.findElement(By.xpath("//input[@name='button' and @accesskey='S']")).click();
		
		String ContactsName=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
        if(ContactsName.contains(first))
        {
        	Reporter.log("Test case passed", true);
        }
        else
        {
        	Reporter.log("Test case failed", false);
        }
        
        //logout the application
       
        WebElement administration = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(administration).perform();
	    driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	    
	}
}
