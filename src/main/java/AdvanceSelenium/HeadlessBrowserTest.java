package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver; 

import com.bat.SeleniumMavenProjectSecond.Utils.UrlTextUtils;
import com.bat.SeleniumMavenProjectSecond.Utils.XpathUtils;

public class HeadlessBrowserTest {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "D:\\do't click (soft)\\webSoft\\selenium\\slenium-files\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver =  new HtmlUnitDriver();
			driver.get(UrlTextUtils.URL.baseUrl);
			
			System.out.println("Homepage Title verified: "+driver.getTitle());
			driver.findElement(By.id(XpathUtils.LoginModule.username)).sendKeys("Admin");
			driver.findElement(By.id(XpathUtils.LoginModule.password)).sendKeys("admin123");
			driver.findElement(By.id(XpathUtils.LoginModule.loginBtn)).click();
			System.out.println("Logged In Successfully");
	}

}
