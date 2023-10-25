import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.time.Duration;


public class Login {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Haseen Khan\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe"); // Set the path to your geckodriver.exe
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.pt7.io/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("sofyrus@yopmail.com");
        loginPage.enterPassword("Hello@123");
        loginPage.clickLoginButton();
        loginPage.EnterBranch();
       // Assertion check on Dashboard
        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[1]/div/div[1]/div[2]")));
        String elementText = textElement.getText();
        System.out.println(elementText);
        String expectedText = "Dr. Jonathan";
        if(elementText.equals((expectedText))) {
            System.out.println("Text on the dashboard matches the expected text.");
        }
        else {
            System.out.println("Text on the dashboard does not match the expected text.");
        }
       // Dependency another page
//        Add_Patient.addPatient(driver);
//        AddUser.addUser(driver);
//        AddTask.addtask(driver);
          scheduler.AddScheduler(driver);
        driver.quit();
    }}



