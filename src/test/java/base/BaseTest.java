package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import reader.ReadDataFromJsonFile;

import java.io.FileNotFoundException;

public class BaseTest {
    WebDriver driver;
   public ReadDataFromJsonFile readDataFromJsonFile;
    public HomePage homePage;

    @BeforeTest
    public void SetUp() throws FileNotFoundException {
    driver = new EdgeDriver();
    readDataFromJsonFile = new ReadDataFromJsonFile();
    driver.get(readDataFromJsonFile.readJsonFile().URL);
    homePage = new HomePage(driver);


    }
}
