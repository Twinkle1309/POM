import Com.demo.nopcommerce.Base.BasePage;

import Com.demo.nopcommerce.Register.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterTestPage {
    WebDriver driver;
    BasePage basePage;
    Properties prop = new Properties();
    RegistrationPage registrationPage;
    @Test(priority = 1)
    public void  openBrowser(){
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("Url"));
        registrationPage= new RegistrationPage(driver);
    }

    @Test(priority = 2)
    public  void registrationTest() throws InterruptedException {
        registrationPage.clickOnRegisterLink();
       registrationPage.getPageTitle();
        registrationPage.doRegister(prop.getProperty("Firstname"),prop.getProperty("Lastname"), prop.getProperty("Dayofbirth"), prop.getProperty("Monthofbirth"), prop.getProperty("Yearofbirth"), prop.getProperty("Email"), prop.getProperty("Company"), prop.getProperty("Password"), prop.getProperty("Confirmpassword"));
Thread.sleep(1000);
    }

    @Test(priority = 3)

    public void closeBrowser(){
        driver.quit();
    }

}
