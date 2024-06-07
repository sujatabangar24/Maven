package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {

    @Test(groups = {"smoke"})
    public void verifySoftAssert() {

        SoftAssert sa=new SoftAssert();


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        WebElement userName= driver.findElement(By.name("identifier"));

        sa.assertEquals(title, "Sign in - google Accounts","Sign in - Google Accounts title should be matched");
        sa.assertTrue(userName.isDisplayed(),"username textbox should be displayed");
        sa.assertAll(); //prints all assertion logs on console, this should be defined after the assertion

        driver.close();

    }
}
