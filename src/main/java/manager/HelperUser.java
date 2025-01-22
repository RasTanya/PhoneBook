package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd){
        super(wd);
    }

    public void openLoginRegistrationForm() {
        click(By.xpath("//*[.='LOGIN']"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.xpath("//input[1]"),email);
        type(By.xpath("//input[2]"),password);
    }

    public void fillRegistrationForm(String email, String password) {
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        type(By.xpath("//input[1]"), i+email);
        type(By.xpath("//input[2]"), password);
    }

    public void submitLogin() {
        wd.findElement(By.xpath("//button[1]")).click();
    }

    public void submitRegistration() {
        wd.findElement(By.xpath("//button[2]")).click();
    }

    public void logout() {
        click(By.xpath("//*[.='Sign Out']"));
    }

    public boolean isLogged(By locator) {
        return isElementPresent(By.xpath("//*[.='Sign Out']"));
    }
}
