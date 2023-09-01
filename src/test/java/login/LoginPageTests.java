package login;

import base.BaseTest;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReadDataDrivenFromJson;
import reader.ReadDataFromJsonFile;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPageTests extends BaseTest {

   // ReadDataFromJsonFile readDataFromJsonFile; Ana 3rftaha Fel Base 5alas.
      ReadDataDrivenFromJson readDataDrivenFromJson;


    @DataProvider
    public Object[] testDataDrivenForSucessfulLogin() throws IOException, ParseException {
        readDataDrivenFromJson = new ReadDataDrivenFromJson();
        return readDataDrivenFromJson.testDataForSucessfulLogin();
    }

    @Test(dataProvider = "testDataDrivenForSucessfulLogin")
    public void testDataDriven(String data){
        String userlogin[] = data.split(",")  ;
        LoginPage loginPage = homePage.clickOnLoginButton();

        loginPage.insertUsername(userlogin[0]);
        loginPage.insertPassword(userlogin[1]);
        loginPage.clickOnSubmitLoginData();

    }

    @Test
    public void TestValidCredentials() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnLoginButton();
       readDataFromJsonFile = new ReadDataFromJsonFile();
        loginPage.insertUsername(readDataFromJsonFile.readJsonFile().Login.ValidCredentials.Username);
        loginPage.insertPassword(readDataFromJsonFile.readJsonFile().Login.ValidCredentials.Password);
        loginPage.clickOnSubmitLoginData();
    }

}
