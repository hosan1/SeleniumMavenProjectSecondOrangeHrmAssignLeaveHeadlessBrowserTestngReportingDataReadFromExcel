package com.bat.SeleniumMavenProjectSecond.Utils;

public class XpathUtils {

	public static class LoginModule {
		
		
		public static final String username = "txtUsername";
		public static final String password = "txtPassword";
		public static final String loginBtn = "btnLogin";

	}

	public static class AssignLeaveModule {
		
		
		public static final String assignLeaveBtn = "/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[1]/div";
		public static final String assignLeaveType = "assignleave_txtLeaveType";
		public static final String assignLeaveFrom = "assignleave_txtFromDate";
		public static final String assignLeaveTo = "assignleave_txtToDate";
		public static final String assignLeaveComment = "assignleave_txtComment";
		public static final String assignLeaveSubmit = "assignBtn";
		public static final String assignLeavePartialDay = "assignleave_partialDays";
		public static final String assignLeaveCommentLabel = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[10]/label";
		
		
	}

}
