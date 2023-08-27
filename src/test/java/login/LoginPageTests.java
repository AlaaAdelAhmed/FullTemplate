package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReadDataFromJsonFile;

import java.io.FileNotFoundException;

public class LoginPageTests extends BaseTest {

   // ReadDataFromJsonFile readDataFromJsonFile; Ana 3rftaha Fel Base 5alas.

    @Test
    public void TestValidCredentials() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnLoginButton();
       readDataFromJsonFile = new ReadDataFromJsonFile();
        loginPage.insertUsername(readDataFromJsonFile.readJsonFile().Login.ValidCredentials.Username);
        loginPage.insertPassword(readDataFromJsonFile.readJsonFile().Login.ValidCredentials.Password);
        loginPage.clickOnSubmitLoginData();
    }
}
