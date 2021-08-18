package com.bat.SeleniumMavenProjectSecond.DataProvider;

import org.testng.annotations.DataProvider;

import com.bat.SeleniumMavenProjectSecond.Utils.ExcellUtils;

public class LoginDataProvider {

	@DataProvider(name = "loginData")
	public static Object[][] getLoginData() {
		try {
			return new Object[][] { { ExcellUtils.getLoginData() }, };

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
