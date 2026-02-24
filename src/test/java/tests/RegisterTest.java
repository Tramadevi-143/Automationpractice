package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.RegisterPage;
import util.ConfigReader;

public class RegisterTest extends BaseClass{
	@Test
	public void RigisterTestLogin() {
		RegisterPage rigister= new RegisterPage(driver, Integer.parseInt(configReader.getProperty("timeout")));
		rigister.EnterUsername(configReader.getProperty("enterusername"));
		rigister.Enterpassword(configReader.getProperty("password"));
		rigister.enterconfirmpassword(configReader.getProperty("confirmpassword"));
		rigister.registerbutton();
	}

}
