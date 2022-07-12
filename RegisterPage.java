package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    By RegLink=By.linkText("Register");
    By Firstname= By.name("FirstName");
    By Lastname=By.name("Lastname");
    By Email= By.name("Email");
    By Password=By.name("Password");
    By ConfirmPassword=By.name("ConfirmPassword");
    By RegisterBtn=By.name("Register");

    public RegisterPage(WebDriver driver){

        this.driver =driver;

    }
    public void clickRegLink() {
        driver.findElement(RegLink).click();
    }
        public void setFirstname(String fname){

        driver.findElement(Firstname).sendKeys(fname);
    }

    public void setLastName(String lname) {

        driver.findElement(Lastname).sendKeys(lname);
    }

    public void setEmail(String email) {
        driver.findElement(Email).sendKeys(email);
    }
    public void setPassword(String pwd) {
        driver.findElement(Password).sendKeys(pwd);
    }

    public void setConfirmPassword(String pwd) {
        driver.findElement(ConfirmPassword).sendKeys(pwd);
    }

    public void clickRegBtn( ) {
        driver.findElement(RegisterBtn).click();
    }
}


