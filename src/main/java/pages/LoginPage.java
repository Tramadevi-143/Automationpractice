package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WaitHelper;

public class LoginPage {
    WebDriver driver;
    WaitHelper wait;

    private By emailField = By.xpath("//input[@id='identifierId']");
    private By nextBtn = By.xpath("//span[text()='Next']");
    private By passField = By.xpath("//input[@name='Passwd']");
    private By profileIcon = By.xpath("//a[@class='gb_B gb_0a gb_1']");
 //   private By signoutBtn = By.xpath("//div[text()='Sign out']");

    public LoginPage(WebDriver driver, int timeout) {
        this.driver = driver;
        this.wait = new WaitHelper(driver, timeout);
    }
    
    //Entering the email address
   
    public void enterEmail(String email1) {
        wait.waitForVisibility(emailField).sendKeys(email1);
        wait.waitForVisibility(nextBtn).click();
    }

    public void enterPassword(String password1) {
        wait.waitForVisibility(passField).sendKeys(password1);
        wait.waitForVisibility(nextBtn).click();
    }

    public void profileTab() {
        wait.waitForVisibility(profileIcon).click();
    }
}
