package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {

    @Test(groups = {"smoke"})

    public void annotationMethod1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        WebElement userName= driver.findElement(By.name("identifier"));

        Assert.assertEquals(title, "Sign in - Google Accounts","Sign in - Google Accounts title should be matched");

        Assert.assertTrue(userName.isDisplayed(),"username textbox should be displayed");
        System.out.println("Hello...Everyone!");

   

    }
}
