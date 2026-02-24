package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.WaitHelper;

public  class RegisterPage {
	WebDriver driver;
	WaitHelper wait;
	private By Enterusername=By.xpath("//input[@name='username']");
	private By Password=By.xpath("//input[@name='password']");
	private By Confirmpassword=By.xpath("//input[@name='confirmPassword']");
	private By Registerbutton=By.xpath("//button[starts-with(text(),'Register')]");
	
	public RegisterPage(WebDriver driver , int timeout) {
		this.driver=driver;
		this.wait=new WaitHelper(driver, timeout);
	}
	public  void EnterUsername(String enterusername) {
		wait.waitForVisibility(Enterusername).sendKeys(enterusername);
	}
	public void Enterpassword(String password) {
		wait.waitForVisibility(Password).sendKeys(password);
	}
	public void enterconfirmpassword(String confirmpassword) {
		wait.waitForVisibility(Confirmpassword).sendKeys(confirmpassword);
	}
	
	public void registerbutton() {
		// wait.until(ExpectedConditions.elementToBeClickable(Registerbutton)).click();
		wait.waitForClikable(Registerbutton).click();
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoview(trues);", btn);
		
	}
		
	}


