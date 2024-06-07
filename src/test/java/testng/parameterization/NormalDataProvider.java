package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProvider {

    public static  WebDriver driver;

    @DataProvider(name="test data")

    public Object[][] dataProviderFunction(){
       return new Object[][]{
               {"Infosys", "Pune"},
               {"Infosys", "Banglore"},
               {"Infosys", "Nagpur"},
               {"Infosys","Hyderabad"}
       };
    }
    @Test(dataProvider = "test data")
    public void verifyParameter(String companyName,String locationName) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
       WebElement searchTextBox =driver.findElement(By.name("q"));
        searchTextBox.sendKeys(companyName+" "+locationName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}
