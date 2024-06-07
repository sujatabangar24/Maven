package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {


  @DataProvider(name="test data")
  public Object[][] dataProviderWithExcel() throws IOException {
    Object[][] arrObj= getDataFromExcel("C:\\Users\\Sujata\\Desktop\\Test.xlsx","testCase1");
    return  arrObj;

  }


   public String[][] getDataFromExcel(String filePath, String sheetName) throws IOException {

       FileInputStream f=new FileInputStream(filePath);
       XSSFWorkbook wb= new XSSFWorkbook(f);
       XSSFSheet s=wb.getSheet(sheetName);
       XSSFRow rows=s.getRow(0);
       int noOfRows= s.getPhysicalNumberOfRows();
       int noOfCol= rows.getLastCellNum();


       Cell cell;

       String[][] data= new String[noOfRows-1][noOfCol];

       for(int i=1; i<noOfRows;i++){
           for(int j=0; j<noOfCol;j++){
               rows=s.getRow(i);
               cell=rows.getCell(j);

               data[i-1][j]=cell.getStringCellValue();
           }
       }
        return data;
      }



    @Test(dataProvider = "test data")
    public void verifyParameter(String companyName,String locationName) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sujata\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchTextBox =driver.findElement(By.name("q"));
        searchTextBox.sendKeys(companyName+" "+locationName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }

}
