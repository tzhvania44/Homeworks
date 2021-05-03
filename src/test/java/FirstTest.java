import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;



public class FirstTest {

    @Test
    public void test() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.yahoo.com/");
        $("._yb_11jp9").setValue("Tako Zhvania").sendKeys(Keys.ENTER);
        sleep(5000);


    }
}



