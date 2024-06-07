package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationEx {


    @Parameters({"companyName","locationName"})
    @Test
    public void verifyParameter(String companyName,String locationName) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        WebElement textBox =driver.findElement(By.name("q"));
        textBox.sendKeys(companyName+" "+locationName);
        textBox.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        driver.close();
    }


}
