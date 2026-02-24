package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ConfigReader;
import util.WaitHelper;

public class LoginpageDoceo {
	WebDriver driver;
	WaitHelper wait;
	
	private By Username =By.xpath("//input[@placeholder='Username']"); 
    private By Password = By.xpath("//input[@placeholder='Password']");
    private By Loginbutton =By.xpath("//button[@name='submit']");
    private By enterInstitutiondetails=By.xpath("//span[normalize-space()='Institution Details']");
    
 public LoginpageDoceo (WebDriver driver ,int timeout) {
	 this.driver=driver;
	 this.wait= new WaitHelper(driver,timeout);
 }
 public void enterusername(String username1 ) {
	 wait.waitForVisibility(Username).sendKeys(username1);
 }
	 public void enterpassword(String password2) {
	 wait.waitForVisibility(Password).sendKeys(password2);
 }
 public void loginbutton() {
	 wait.waitForVisibility(Loginbutton).click();
 }
 //public void enterInstitutiondetails() {
//	 wait.waitForClikable(enterInstitutiondetails).click();
// }
 
 
 
 

}