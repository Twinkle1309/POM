package Com.demo.nopcommerce.Register;

import Com.demo.nopcommerce.Utilites.Constant;
import Com.demo.nopcommerce.Utilites.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;
static Utils utils;
static By registerLink= By.className("ico-register");
By gender= By.id("gender-female");
By firstName= By.id("FirstName");
By lastName= By.id("LastName");
By dayOfBirth=By.name("DateOfBirthDay");
By monthOfBirth= By.name("DateOfBirthMonth");
By yearOfBirth=By.name("DateOfBirthYear");
By email= By.id("Email");
By company=By.id("Company");
By password=By.id("Password");
By confirmPassword= By.xpath("//*[@id=\"ConfirmPassword\"]");
By registerButton=By.id("register-button");
public RegistrationPage(WebDriver driver){
    this.driver=driver;
    utils=new Utils(driver);

}
public static void clickOnRegisterLink(){
    utils.doClick(registerLink);
}
    public String getPageTitle(){

    return utils.waitForTitlePresent(30, Constant.REGISTER_PAGE_TITLE);
    }

public void doRegister(String Firstname, String Lastname,String Dayofbirth,String Monthofbirth, String Yearofbirth, String Email,String Company, String Password, String Confirmpassword) {
  utils.doClick(gender);
    utils.doSendKey(firstName,Firstname);
    utils.doSendKey(lastName,Lastname);
    utils.doSendKey(dayOfBirth,Dayofbirth);
    utils.doSendKey(monthOfBirth,Monthofbirth);
    utils.doSendKey(yearOfBirth,Yearofbirth);
    utils.doSendKey(email,Email);
    utils.doSendKey(company,Company);
    utils.doSendKey(password,Password);
    utils.doSendKey(confirmPassword,Confirmpassword);
    utils.doClick(registerButton);

}
}
