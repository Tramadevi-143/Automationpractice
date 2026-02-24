package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.WaitHelper;

public class LoginpageGmail1 {
	WebDriver driver;
	WaitHelper wait;
	private By Enteremail=By.xpath("//input[@id='identifierId']");
	private By Next=By.xpath("//span[normalize-space()='Next']");
	private By Enterpassword=By.name("Passwd");
	private By Nextbutton=By.xpath("//span[normalize-space()='Next']");
	private By Tryanotherway=By.xpath("//span[normalize-space()='Try another way']");
	private By Continuebutton=By.xpath("//span[normalize-space()='Continue']");
	private By Continuetogmail=By.xpath("//a[normalize-space()='Continue to Gmail']");

    public LoginpageGmail1(WebDriver driver, int timeout) {
        this.driver = driver;
        this.wait = new WaitHelper(driver, timeout);
    }
    public void enteremail(String email2) {
    	wait.waitForVisibility(Enteremail).sendKeys(email2);
    }
    public void Next() {
    	wait.waitForClikable(Next).click();
    	
    }
   
    public void enterpassword(String password4) {
    	wait.waitForVisibility(Enterpassword).sendKeys(password4);
    }
    public void Nextbutton() {
	wait.waitForClikable(Nextbutton).click();
}
    public void tryanotherway() {
	wait.waitForClikable(Tryanotherway).click();
}
    public void continuebutton() {
    	wait.waitForClikable(Continuebutton).click();
    	
    }
    public void continuetogmail() {
    	wait.waitForClikable(Continuetogmail).click();
    }
}
