import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.AuthPage;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class TestDemoQa {
    private final String userName = "hich";
    private final String password = "!QAZ1qaz";

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @BeforeClass
    public static void setup() {
        Configuration.browser = "firefox";
        baseUrl = "https://demoqa.com/";
        open(baseUrl);
        $(By.xpath("//div[6][@class='card mt-4 top-card']")).click();
    }


    @Test
    public void testAuth() {
        AuthPage authPage = new AuthPage();
        authPage.clickLoginButton();
        authPage.setUserNameField(getUserName());
        authPage.setPasswordField(getPassword());
        authPage.clickLoginButton();
    }
//    @Test
//    public void testAuth() {
//        $("#login").click();
//        $("#userName").setValue(getUserName());
//        $("#password").setValue(getPassword());
//        $("#login").click();
//        $("#userName-value").shouldHave(text(getUserName()));
//    }
//
    @Test
    public void testBooksInfo() {
        $$(".rt-tr-group").shouldHave(size(10));
        $(".mr-2 a").shouldHave(text("Git Pocket Guide"));
        $(".rt-tr-group").shouldHave(text("Richard E. Silverman"));
        $(".rt-tr-group").shouldHave(text("O'Reilly Media"));
    }

//    @Test
//    public void testProfile() {
//        $(By.xpath("//div[6][@class='element-group']")).click();
////        open(baseUrl+"profile");
//        $("#item-3").shouldBe(visible, clickable).click();
//        $("#userName-value").shouldHave(text(getUserName()));
//    }


}
