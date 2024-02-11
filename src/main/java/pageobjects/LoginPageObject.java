package pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {
    By btnSingUp = By.xpath("//a[@title='Log in to your customer account']");
    By txtUserName = By.id("email");
    By txtPassword = By.id("passwd");
    By signIn = By.id("SubmitLogin");
    By logOff = By.xpath("//a[@title='Log me out']");

    By myAccount = By.xpath("//h1[contains(text(), 'My account')]");

    public By getBtnSingUp() {
        return btnSingUp;
    }

    public By getTxtUserName() {
        return txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getSignIn() {
        return signIn;
    }
    public By getMyAccount() {
        return myAccount;
    }

    public By getLogOff() {
        return logOff;
    }

    public void abrirPagina(){
        getDriver().get("http://www.automationpractice.pl/index.php");
    }

    public void clicOnSingUp(){
        getDriver().findElement(getBtnSingUp()).click();
    }
    public void writeUser_Password() throws InterruptedException {
        getDriver().findElement(getTxtUserName()).sendKeys("ja@gmail.com");
        getDriver().findElement(getTxtPassword()).sendKeys("Ayala.1212");
        getDriver().findElement(getSignIn()).click();
        Serenity.takeScreenshot();
        if(getDriver().findElement(getMyAccount()).isEnabled()){
            System.out.println("Me he logeado exitosamente");
        }
    }

    public void logOffUser(){
        getDriver().findElement(getLogOff()).click();
        Serenity.takeScreenshots();
    }


}
