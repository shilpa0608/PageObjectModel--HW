package com.demo.nopcommercetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterPageTest {
    @Test
    public void getRegisterPage()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shilp\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        RegisterPage RP = new RegisterPage(driver);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        RP.setFirstname("Sai");
        RP.setLastName("Ram");
        RP.setEmail("tes123@gmail.com");
        RP.setPassword("Happy123");
        RP.setConfirmPassword("Happy123");
        RP.clickRegBtn();


    }
}




