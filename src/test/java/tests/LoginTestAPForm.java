package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPageAPForm;

public class LoginTestAPForm extends BaseClass  {

	 @Test
	    public void testValidLogin() {
LoginPageAPForm loginpageAp=new LoginPageAPForm(driver, Integer.parseInt(configReader.getProperty("timeout")));
loginpageAp.enterFirstname(configReader.getProperty("firstname"));
loginpageAp.enterLastname(configReader.getProperty("lastname"));
loginpageAp.enterUsername(configReader.getProperty("username"));
loginpageAp.enterPassword(configReader.getProperty("password2"));
loginpageAp.BacktoLogin();
	 }
}
