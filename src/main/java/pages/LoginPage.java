package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class LoginPage extends MethodHandels {
    //Super l2no 3mla inhenrnt f est5dmt el constructor bta3 el tany

    public LoginPage(WebDriver driver){
        super(driver);
    }

    private By usernameField = By.id("Email");
    private By passwordField = By.id("Password");

    private By submitButton = By.xpath("//button[contains(text(),'Log in')]");
    public void insertUsername(String username){
        sendKeys(usernameField,username);
    }

    public void insertPassword(String password){
        sendKeys(passwordField,password);
    }

    public void clickOnSubmitLoginData(){
        click(submitButton);
    }
}
