import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By emailInput = By.name("email");
    private By passwordInput = By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div[2]/div/div[1]/input");
    private  By loginButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/button/div");
    private By selectBranch = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/div/div/div/a[1]/div");




    public  LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    // page Methods
    public void enterEmail(String email) {
        WebElement emailInputField = wait.until(ExpectedConditions.elementToBeClickable(emailInput));
        emailInputField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        passwordInputField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        loginBtn.click();
    }

    public  void EnterBranch() {
        WebElement branch = wait.until(ExpectedConditions.visibilityOfElementLocated(selectBranch));
        branch.click();
    }
}



