import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSite {
    String baseDir = "https://demoqa.com/";
    WebDriver webDriver = new ChromeDriver();

//    @Test
//    public void testSite() {
//        webDriver.get(baseDir+"elements");
////        webDriver.findElement(new By.ById("item-0")).click();
//        webDriver.findElement(new By.ByXPath("//li[@id='item-0']")).click();
//        webDriver.findElement(new By.ByXPath("//input[@id='userName']")).sendKeys("John");
//        webDriver.findElement(new By.ByXPath("//input[@id='userEmail']")).sendKeys("john@ya.ru");
//        webDriver.findElement(new By.ByXPath("//textarea[@id='currentAddress']")).sendKeys("Samara");
//        webDriver.findElement(new By.ByXPath("//textarea[@id='permanentAddress']")).sendKeys("Moscow");
//        webDriver.findElement(new By.ByXPath("//button[@id='submit']")).click();
////        webDriver.findElement(new By.ById("submit")).click();
//
////        webDriver.findElement(new By.ById("passp-field-login")).sendKeys("hichlist");
////        webDriver.findElement(new By.ById("passp:sign-in")).click();
////        webDriver.findElement(new By.ByClassName("Button2-Text")).click();
////        webDriver.findElement(new By.ById("passp-field-passwd")).sendKeys("Qwaspolk10");
////        webDriver.findElement(new By.ByClassName("Button2 Button2_size_xxl Button2_view_contrast-action Button2_width_max Button2_type_submit")).click();
//
//    }

    @Test
    public void testAuth() {
        webDriver.get(baseDir+"books");
        webDriver.findElement(new By.ByXPath("//button[@id='login']")).click();
        webDriver.findElement(new By.ByXPath("//input[@id='userName']")).sendKeys("hich");
        webDriver.findElement(new By.ByXPath("//input[@id='password']")).sendKeys("!QAZ1qaz");
        webDriver.findElement(new By.ByXPath("//button[@id='login']")).click();

    }

//    @Test
//    public void testNewUser() {
//        webDriver.get(baseDir+"books");
//        webDriver.findElement(new By.ByXPath("//button[@id='login']")).click();
//        webDriver.findElement(new By.ByXPath("//button[@id='newUser']")).click();
//    }

    @Test
    public void testProfile() {
        webDriver.get(baseDir+"books");
        webDriver.findElement(new By.ByXPath("//li[@id='item-3']")).click();
    }
}
