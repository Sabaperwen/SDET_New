package testYantra;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCampeighn {
	@Test
	public void createCampaigns() throws InterruptedException
	{
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
		
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(more).perform();
		driver.findElement(By.xpath("//a[@id=\"more\" and @name='Campaigns']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		String campaingnName="tyss";
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("tyss");
		WebElement cmpgnType = driver.findElement(By.name("campaigntype"));
		Select select=new Select(cmpgnType);
		select.selectByIndex(7);
		
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		
		String CreatedCmpgn = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(campaingnName.contains(CreatedCmpgn))
		{
			Reporter.log("test case passed", true);
		}
		else {
			Reporter.log("Test case failed", false);
		}
		
		//To Click On Opportunities
		driver.findElement(By.xpath("//a[.='Opportunities']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
		
		String opportunityName="Something";
		driver.findElement(By.xpath("//input[@name='potentialname']")).sendKeys(opportunityName);
		String mainWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		Set<String> allWindow = driver.getWindowHandles();
		for(String window:allWindow)
		{
			driver.switchTo().window(mainWindow);
		}
		driver.findElement(By.xpath("//input[@name='campaignid']//following-sibling::img")).click();
       Thread.sleep(3000);		
//		WebElement CmpgnPage = driver.findElement(By.xpath("//td[.='Campaigns']"));
		String expectedLink = "tyss";
//		
		Set<String> allId = driver.getWindowHandles();
		for(String id:allId)
		{
			driver.switchTo().window(id);
			WebElement actualLink = driver.findElement(By.xpath("//a[@id='1' and @]"));
			{
				if(actualLink.getText().equals(expectedLink))
				{
				  actualLink.click();
				}
			}
				
			}
			
		
                 
		
	
	}

}
