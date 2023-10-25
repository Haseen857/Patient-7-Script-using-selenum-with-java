import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Add_Patient {
    public static void addPatient(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Click on Add patient
        WebElement Addpatient = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/header/div/div[1]/button")));
        Addpatient.click();

       // Select firstName
        WebElement FirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[1]/div[2]/div/form/div[1]/div[2]/div[1]/div[1]/div/input")));
        Addpatient.click();
        String randoString = new Random().ints(5, 65, 91).collect(StringBuilder::new, (sb, n) -> sb.append((char) n), StringBuilder::append).toString();
        FirstName.sendKeys(randoString);

       // Select LastName
        WebElement LastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[1]/div[2]/div/form/div[1]/div[2]/div[1]/div[3]/div/input")));
        String randooString = new Random().ints(5, 65, 91).collect(StringBuilder::new, (sb, n) -> sb.append((char) n), StringBuilder::append).toString();
        LastName.sendKeys(randooString);

        // Select DatePicker
        WebElement DatePicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[1]/div[2]/div/form/div[1]/div[2]/div[1]/div[4]/div/button")));
        DatePicker.click();

        // Click Date Picker
        WebElement SelectDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[1]/div[2]/div/form/div[1]/div[2]/div[1]/div[4]/div[2]/div/div/div/table/tbody/tr[3]/td[3]/button")));
        SelectDate.click();

       // Select genderDropdown
        WebElement genderDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[1]/div[2]/div/form/div[1]/div[2]/div[1]/div[5]/div/div/input")));
        genderDropdown.click();

        // Click Dropdown
        WebElement secondOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mantine-Select-dropdown")));
        String optionText = secondOption.getText();
        System.out.println("Text of the second option: " + optionText);
        secondOption.click();

        // Select Health card Number
        WebElement HealthCardNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"healthCardNoInput1\"]")));
        String randString = new Random().ints(2, 65, 91).collect(StringBuilder::new, (sb, n) -> sb.append((char) n), StringBuilder::append).toString();
        long randomTenDigitNumber = (long) (Math.random() * 9_000_000_000L) + 1_000_000_000L;
        System.out.println("hjfjttdtdud"+randomTenDigitNumber+randString);
        HealthCardNumber.sendKeys(randomTenDigitNumber+randString);

       // Select Mobile Number
        WebElement MobileNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"primaryPhone\"]")));
        MobileNumber.sendKeys("18755574928");

        // Select Email
        WebElement Email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[1]/div[2]/div/form/div[1]/div[2]/div[1]/div[9]/div[1]/input")));
        System.out.println(Email);
        String randomString = new Random().ints(5, 65, 91).collect(StringBuilder::new, (sb, n) -> sb.append((char) n), StringBuilder::append).toString();
        System.out.println(randomString);
        Email.sendKeys(randomString+"@yopmail.com");

        // Click Button
        WebElement ButtonClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/div/div[1]/div[2]/div/form/div[2]/button[2]")));
        ButtonClick.click();

        WebElement AddEmpergency = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[1]/div[1]/div[2]/button")));
        AddEmpergency.click();

        WebElement FullNameEmergency = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[1]/div[1]/input")));
        FullNameEmergency.sendKeys("Yara");

        WebElement Relationship = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[2]/div[1]/input")));
        Relationship.sendKeys("Sister");

        WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[3]/div[1]/input")));
        phoneNumber.sendKeys("19090909090");

        WebElement Address = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[2]/div[1]/div/div/textarea")));
        Address.sendKeys("flat no 305 saad apartment near shamshaad market");

        WebElement SaveEmergency = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[2]/div[2]/div/button[2]")));
        SaveEmergency.click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement insuranceButton = driver.findElement(By.xpath("//button[contains(., 'Insurance Details')]"));

        System.out.println(insuranceButton);
        insuranceButton.click();

        WebElement AddNewInsurance = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[1]/div[1]/div[2]/button"));
        AddNewInsurance.click();

        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[1]/div/input")).sendKeys("Haseen");
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[2]/div/input")).sendKeys("909090909090");

        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[3]/div/input")).sendKeys("9392030203");
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[4]/div/input")).sendKeys("9393929392");
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[5]/div/input")).sendKeys("4545454545");
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[6]/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[6]/div[2]/div/div/div/div/button[3]")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[6]/div[2]/div/div/div/div/button[3]")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[6]/div[2]/div/div/div/table/tbody/tr[5]/td[7]/button")).click();
//        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[6]/div[2]/div/div/div/table/tbody/tr[5]/td[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[7]/div[1]/input")).sendKeys("Haseen");
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[8]/div[1]/input")).sendKeys("Khan");

        WebElement genderDropdowns = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[9]/div/div/input")));
        genderDropdowns.click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[1]/div[9]/div[2]/div/div/div/div/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[2]/div[1]/div/div[1]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[2]/div[1]/div/div[1]/div[2]/div/div/div/table/tbody/tr[4]/td[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[2]/div[2]/div/div/textarea")).sendKeys("305 saad apartment shamshaad market");
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[2]/div[1]/div/div[2]/div/input")).sendKeys("Full time");
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div/form/div[2]/div[3]/div/button[2]")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

