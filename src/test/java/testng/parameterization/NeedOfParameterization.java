package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization {

    public static String companyName="Infosys";
    public static String locationName="Banglore";

    @Test
    public void verifyParameter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        WebElement textBox =driver.findElement(By.name("q"));
        //textBox.sendKeys("Infosys"+" "+"Banglore"); never hardcode the test data when it's been used in larger time for that parameterization for the same data

        textBox.sendKeys(companyName+" "+locationName);
        textBox.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        driver.close();
    }
}
