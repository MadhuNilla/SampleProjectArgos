package com.argos.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory()
    {
        PageFactory.initElements(driver,this);
    }
    public void openBrowser() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config.properties");
        properties.load(fileInputStream);
        String url = properties.getProperty("baseurl");
        String browser = properties.getProperty("browser");

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        System.setProperty("webdriver.gecko.driver", "geckodriver");

        if (browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
            System.out.println("The chrome browser has been invoked");

        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            driver= new FirefoxDriver();
            System.out.println("The firefox browser is invoked");
        }
        else
        {
            System.out.println("Specify browser as chrome");
        }

        driver.get(url);


    }


    public void closeBrowser()
    {
        //driver.quit();
    }
}


