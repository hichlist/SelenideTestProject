import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class TestDemoQa {

    @BeforeClass
    public static void setup() {
        Configuration.browser = "chrome";
        baseUrl = "https://demoqa.com/";
        timeout = 40000;
        open(baseUrl+"books");

    }

    @Test
    public void testAuth() {
        $("#login").click();
    }

}
