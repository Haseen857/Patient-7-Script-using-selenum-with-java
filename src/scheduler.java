import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class scheduler {
    public static void AddScheduler(WebDriver driver) {

       driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/div[1]/div/button[2]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[2]/div/div/div[1]/div[2]/div[2]/div/button[3]")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[2]/div/div/div[1]/div[1]/div[1]/button[2]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[2]/div/div/div[1]/div[1]/div[1]/button[2]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[2]/div/div/div[2]/div[5]/div[2]/div[1]/div[3]")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div[1]")).click();

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]")).click();

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[2]/div[2]/div/div[1]/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[2]/div[2]/div/div[2]/div/div/div/div/div/div[2]")).click();

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[2]/button[2]")).click();

//        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[2]/div[5]/div/div[1]/div/input")).click();
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[2]/div[5]/div/div[1]/div/input")).click();
//        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[2]/div[5]/div/div[1]/div")).sendKeys("10");

    }
}
