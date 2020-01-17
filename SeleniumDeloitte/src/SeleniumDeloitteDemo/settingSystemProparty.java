package SeleniumDeloitteDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class settingSystemProparty {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Documents//chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("online fps games");
		driver.get("https://access.trivago.com/oauth/en-IN/login?step=login");
		driver.findElement(By.id("login_email")).sendKeys("inajirs97@gmail.com");
		driver.findElement(By.id("login_password")).sendKeys("iceandspice");
		driver.findElement(By.id("login_submit")).click();
	//	driver.close();	
	}

}
