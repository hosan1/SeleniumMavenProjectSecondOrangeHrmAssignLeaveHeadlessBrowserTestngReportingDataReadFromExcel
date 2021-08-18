package com.bat.SeleniumMavenProjectSecond.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bat.SeleniumMavenProjectSecond.DTO.LoginDTO;
import com.bat.SeleniumMavenProjectSecond.DataProvider.LoginDataProvider;
import com.bat.SeleniumMavenProjectSecond.Utils.DriverManager;
import com.bat.SeleniumMavenProjectSecond.Utils.TestNGReporting;
import com.bat.SeleniumMavenProjectSecond.Utils.UrlTextUtils;
import com.bat.SeleniumMavenProjectSecond.Utils.XpathUtils;
import java.util.List;


@Listeners(TestNGReporting.class)
public class LoginTest {

	private WebDriver driver = null;

	@Test
	public void homepagetitleverify() {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.baseUrl);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Test.homepageTitle);
		System.out.println("Homepage Title verified");
	}

	@Test(dependsOnMethods = "homepagetitleverify", dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void logintest(List<LoginDTO> logData) {
		for (LoginDTO login : logData) {
			driver.findElement(By.id(XpathUtils.LoginModule.username)).sendKeys(login.getUsername());
			driver.findElement(By.id(XpathUtils.LoginModule.password)).sendKeys(login.getPassword());
			driver.findElement(By.id(XpathUtils.LoginModule.loginBtn)).click();
			System.out.println("Logged In Successfully");
		}

	}
}
