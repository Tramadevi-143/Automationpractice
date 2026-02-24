package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginpageDoceo;

public class LoginTestDoceo extends BaseClass {

	 @Test
	    public void testDoceo() {
		 LoginpageDoceo loginpagedoceo= new LoginpageDoceo(driver, Integer.parseInt(configReader.getProperty("timeout")));
	loginpagedoceo.enterusername(configReader.getProperty("username1" ));
	loginpagedoceo.enterpassword(configReader.getProperty("password2"));
	loginpagedoceo.loginbutton();
	//loginpagedoceo.enterInstitutiondetails();
	
	
	

	}

}
