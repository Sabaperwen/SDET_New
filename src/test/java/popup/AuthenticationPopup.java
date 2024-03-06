package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   String userName="admin";
	   String password="admin";
	   String url="https://"+userName+":"+password+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app";
	   driver.get(url);
	}

}
