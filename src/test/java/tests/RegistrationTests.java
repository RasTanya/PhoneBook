package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

//    WebDriver wd;

//    @BeforeMethod
//    public void init() {
//        wd = new ChromeDriver();
//        wd.navigate().to("https://telranedu.web.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }

    @Test
    public void registrationPositiveTest() {
        //open login form
        app.getHelperUser().openLoginRegistrationForm();
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        // fill login form
        app.getHelperUser().fillRegistrationForm("dktlA@gol.com", "$Abcd12345");
//        int i = (int)(System.currentTimeMillis()/1000)%3600;
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("dkt"+i+"lA@gol.com");
//        WebElement passdInput = wd.findElement(By.xpath("//input[2]"));
//        passdInput.click();
//        passdInput.clear();
//        passdInput.sendKeys("$Abcd12345");
        //click on registration button
        app.getHelperUser().submitRegistration();
//        wd.findElement(By.xpath("//button[2]")).click();

        //Assert user is registrated in
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
//        Assert.assertTrue(wd.findElements(By.tagName("button")).size()>0);
    }

    @Test
    public void registrationNegaitiveTestWrongEmail() {
        //open login form
        app.getHelperUser().openLoginRegistrationForm();
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        // fill login form
        app.getHelperUser().fillRegistrationForm("dktlAgol.com", "$Abcd12345");
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("dktlAgol.com");
//        WebElement passdInput = wd.findElement(By.xpath("//input[2]"));
//        passdInput.click();
//        passdInput.clear();
//        passdInput.sendKeys("$Abcd12345");
        //click on registration button
        app.getHelperUser().submitRegistration();
//        wd.findElement(By.xpath("//button[2]")).click();

        //Assert user is registrated
        // pause(3000);
        Assert.assertTrue(app.getHelperUser().isAlertPresent());
    }

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
