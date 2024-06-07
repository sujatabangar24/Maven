package testng.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodEx {

    public WebDriver driver;


   @BeforeMethod

    public void beforeMethodEx(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
    }


    @Test
    public void annotationMethod1()
    {

        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();



    }

    @Test
    public void annotationMethod2()
    {

        driver.get("https://www.ajio.com/");
        driver.manage().window().maximize();



    }

    @AfterMethod
    public void afterMethodEx(){

       driver.close();
    }
}
