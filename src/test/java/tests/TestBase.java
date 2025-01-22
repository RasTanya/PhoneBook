package tests;

import manager.ApplicationManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {
//    WebDriver wd;
    static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
//    public void init() {
//        wd = new ChromeDriver();
//        wd.navigate().to("https://telranedu.web.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }
    public void setup(){
       app.init();
    }

    @AfterSuite
//    public void tearDown() {
//        pause(5000);
//        wd.quit();
//    }
    public void stop(){
        app.tearDown();
    }

//    public void pause(int millis){
//        try {
//            Thread.sleep(millis);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public boolean isAlertPresent(){
//        Alert alert = new WebDriverWait(wd, 5).until(ExpectedConditions.alertIsPresent());
//        if(alert == null) return false;
//        else {
//            wd.switchTo().alert();
//            System.out.println(alert.getText());
//            alert.accept();
//            return true;
//        }
//    }

//    public void openLoginRegistrationForm() {
//        click(By.xpath("//*[.='LOGIN']"));
////        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//    }

//    public void fillLoginForm(String email, String password) {
//        type(By.xpath("//input[1]"),email);
////        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
////        emailInput.click();
////        emailInput.clear();
////        emailInput.sendKeys(email);
//        type(By.xpath("//input[2]"),password);
////        WebElement passdInput = wd.findElement(By.xpath("//input[2]"));
////        passdInput.click();
////        passdInput.clear();
////        passdInput.sendKeys(password);
//    }

//    public void fillRegistrationForm(String email, String password) {
//        int i = (int)(System.currentTimeMillis()/1000)%3600;
//        type(By.xpath("//input[1]"), i+email);
////        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
////        emailInput.click();
////        emailInput.clear();
////        emailInput.sendKeys(i+email);
//        type(By.xpath("//input[2]"), password);
////        WebElement passdInput = wd.findElement(By.xpath("//input[2]"));
////        passdInput.click();
////        passdInput.clear();
////        passdInput.sendKeys(password);
//    }

//    public void submitLogin() {
//        wd.findElement(By.xpath("//button[1]")).click();
//    }

//    public void submitRegistration() {
//        wd.findElement(By.xpath("//button[2]")).click();
//    }

//    public boolean isElementPresent(By locator) {
//        return wd.findElements(locator).size() > 0;
//    }

//    public void logout() {
//        click(By.xpath("//*[.='Sign Out']"));
//    }

//    public void click(By locator) {
//        wd.findElement(locator).click();
//    }
//
//    public void type(By locator, String text) {
//        WebElement element = wd.findElement(locator);
//        element.click();
//        element.clear();
//        element.sendKeys(text);
//    }

//    public boolean isLogged(By locator) {
//        return isElementPresent(By.xpath("//*[.='Sign Out']"));
//    }
}
