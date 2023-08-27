package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class HomePage extends MethodHandels {

    // WebDriver driver; ana bst5dm el super msh b3rfo hena alas
     public HomePage (WebDriver driver){
         super(driver);
     }

     public By loginButton =  By.cssSelector(".ico-login");

     public LoginPage clickOnLoginButton(){
         click(loginButton);
         return new LoginPage(driver);
     }
}
