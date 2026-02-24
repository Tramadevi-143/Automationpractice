package tests;

import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import base.BaseClass;import pages.LoginPage;
import pages.LoginpageGmail1;

public class LoginTestgmail1 extends BaseClass{
	@Test
    public void testlogingmail1() throws InterruptedException {
        LoginpageGmail1 loginpage1 = new LoginpageGmail1(driver, Integer.parseInt(configReader.getProperty("timeout")));
        loginpage1.enteremail(configReader.getProperty("email2"));
        loginpage1.Next();
        
        //Thread.sleep(3000);
        loginpage1.enterpassword(configReader.getProperty("password4"));
        System.out.println(driver.getPageSource());
        loginpage1.Nextbutton();
        loginpage1.tryanotherway();
        loginpage1.continuebutton();
        loginpage1.continuetogmail();
        

}
}