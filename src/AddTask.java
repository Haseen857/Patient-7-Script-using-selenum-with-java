import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class AddTask {
    public static void addtask(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/div[1]/div/button[6]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[3]/button")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement Task = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[1]/div[1]/div/div/input")));
        Task.click();
        String randoString = new Random().ints(5, 65, 91).collect(StringBuilder::new, (sb, n) -> sb.append((char) n), StringBuilder::append).toString();
        Task.sendKeys(randoString);

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[1]/div[2]/div/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]")).click();

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[2]/div[1]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[2]/div[1]/div/div[2]/div/div/div/table/tbody/tr[6]/td[2]/button")).click();

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[2]/div[2]/div/div[1]/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[2]/div[2]/div/div[2]/div/div/div/div/div/div[3]")).click();

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[2]/div[3]/div/div[1]/div/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[1]")).click();

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[3]/div/div/div/textarea")).sendKeys("305 saad apartment shamshaad market");

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[4]/div/div[2]/div[1]/div/div[1]/input")).click();

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[5]/button[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
