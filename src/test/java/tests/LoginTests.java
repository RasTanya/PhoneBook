package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

//    WebDriver wd;
//
//    @BeforeMethod
//    public void init() {
//        wd = new ChromeDriver();
//        wd.navigate().to("https://telranedu.web.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }

    @Test
    public void loginPositiveTest() {
        app.getHelperUser().openLoginRegistrationForm();
        //open login form
//        openLoginRegistrationForm();
//       wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        // fill login
        app.getHelperUser().fillLoginForm("kgtsest@com", "$Abcd12345");
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("kgtsest@gmail.com");
//        WebElement passdInput = wd.findElement(By.xpath("//input[2]"));
//        passdInput.click();
//        passdInput.clear();
//        passdInput.sendKeys("$Abcd12345");
        //click on login button
        app.getHelperUser().submitLogin();
//        wd.findElement(By.xpath("//button[1]")).click();

        //Assert user is logged in
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
//        Assert.assertTrue(wd.findElements(By.tagName("button")).size()>0);
    }

    @Test
    public void loginNegativeTestWrongEmail() {
        //open login form
        app.getHelperUser().openLoginRegistrationForm();
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        // fill login
        app.getHelperUser().fillLoginForm("kgtsest.com", "$Abcd12345");
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("kgtsest.com");
//        WebElement passdInput = wd.findElement(By.xpath("//input[2]"));
//        passdInput.click();
//        passdInput.clear();
//        passdInput.sendKeys("$Abcd12345");
        //click on login button
        app.getHelperUser().submitLogin();
//        wd.findElement(By.xpath("//button[1]")).click();

        //Assert user is logged in
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isAlertPresent());

    }
    @Test
    public void loginNegativeTestWrongPassword() {
        //open login form
        app.getHelperUser().openLoginRegistrationForm();
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        // fill login
        app.getHelperUser().fillLoginForm("kgtsest@com", "Abcd12345");
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("kgtsest@com");
//        WebElement passdInput = wd.findElement(By.xpath("//input[2]"));
//        passdInput.click();
//        passdInput.clear();
//        passdInput.sendKeys("Abcd12345");
        //click on login button
        app.getHelperUser().submitLogin();
//        wd.findElement(By.xpath("//button[1]")).click();

        //Assert user is logged in
       // pause(3000);
        Assert.assertTrue(app.getHelperUser().isAlertPresent());

    }
//
//    @AfterMethod
//    public void tearDown() {
//        pause(5000);
//        wd.quit();
//    }

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


}
