import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Random;

public class AddUser {
    public static void addUser(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/div[2]/div/button")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/div[1]/div[1]/button[5]")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[2]/div/div[1]/div[2]/button")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div[1]/div/div/div[1]")).click();


        WebElement FirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[1]/div[2]/div/div/input")));
        FirstName.click();
        String randoString = new Random().ints(5, 65, 91).collect(StringBuilder::new, (sb, n) -> sb.append((char) n), StringBuilder::append).toString();
        FirstName.sendKeys(randoString);


        WebElement LastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[2]/div[1]/input")));
        String randooString = new Random().ints(5, 65, 91).collect(StringBuilder::new, (sb, n) -> sb.append((char) n), StringBuilder::append).toString();
        LastName.sendKeys(randooString);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[4]/div[1]/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[4]/div[2]/div/div/div/div/div/div[1]")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[5]/div[1]/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[5]/div[2]/div/div/div/div/div/div[1]")).click();


        WebElement Email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[7]/div[1]/input")));
        System.out.println(Email);
        String randomString = new Random().ints(5, 65, 91).collect(StringBuilder::new, (sb, n) -> sb.append((char) n), StringBuilder::append).toString();
        System.out.println(randomString);
        Email.sendKeys(randomString+"@yopmail.com");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[8]/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[8]/div/div/div[2]/button")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[6]/div[1]/div/div[1]/input")).sendKeys("305 saad apartment shamshaad market");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[7]/div[1]/div[1]/input")).sendKeys("Roorkee");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[7]/div[4]/div[1]/input")).sendKeys("19898989898");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[8]/div/div/input")).sendKeys("8787878787");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div/form/div[9]/button[2]")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
