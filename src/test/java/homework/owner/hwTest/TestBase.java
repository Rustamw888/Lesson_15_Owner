package homework.owner.hwTest;

import homework.owner.hwConfig.WebConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    public static void setUp() {
        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        Configuration.browser = webConfig.getBrowser();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        if (!webConfig.getRemoteWebDriver().equals("")) {
            Configuration.remote = webConfig.getRemoteWebDriver();
        }
        String baseUrlString = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrlString)) {
            baseUrlString = "https://google.com";
        }
        open(baseUrlString);
    }
}
