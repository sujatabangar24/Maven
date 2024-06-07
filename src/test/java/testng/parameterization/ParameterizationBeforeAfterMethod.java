package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationBeforeAfterMethod {

    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodAnnotation(String browserName){

        if(browserName.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();


        } else if (browserName.equalsIgnoreCase("edge")) {

             System.setProperty("webdriver.edge.driver","C:\\Users\\Sujata\\Downloads\\edgedriver_win64\\msedgedriver.exe");
             driver =new EdgeDriver();
             driver.get("https://www.google.com/");
             driver.manage().window().maximize();

            
        }else {
            throw new RuntimeException("please select correct browser");
        }


    }

    @Parameters({"companyName","locationName"})
    @Test
    public void verifyParameter(String companyName,String locationName) throws InterruptedException
    {
        WebElement textBox =driver.findElement(By.name("q"));
        textBox.sendKeys(companyName+" "+locationName);
        textBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}
