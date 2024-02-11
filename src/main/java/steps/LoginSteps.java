package steps;

import pageobjects.LoginPageObject;

public class LoginSteps {
    LoginPageObject objLoginPageObject = new LoginPageObject();
    public void Login() throws InterruptedException {
        objLoginPageObject.abrirPagina();
        objLoginPageObject.clicOnSingUp();
        objLoginPageObject.writeUser_Password();
    }

    public void LogOff(){
        objLoginPageObject.logOffUser();
    }


}
