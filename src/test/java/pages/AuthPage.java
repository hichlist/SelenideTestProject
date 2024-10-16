package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class AuthPage {
    private SelenideElement userNameField = $("#userName");
    private SelenideElement passwordField = $("#password");
    private SelenideElement loginButton = $("#login");


    public void setPasswordField(String password) {
        passwordField.setValue(password);
    }

    public void setUserNameField(String userName) {
        userNameField.setValue(userName);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
