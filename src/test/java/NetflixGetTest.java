import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixGetTest{
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\JEEVITESWARI\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.netflix.com/in/");
    }
}
