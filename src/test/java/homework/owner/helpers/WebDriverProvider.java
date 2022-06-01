package homework.owner.helpers;

import homework.owner.hwConfig.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Objects;
import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    public WebDriverProvider() {
    }

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseURL());
        return driver;
    }

    private WebDriver createWebDriver() {
        if (Objects.isNull(config.getRemoteURL())) {
            if (config.getBrowser().equals(BrowserHW.FIREFOX.toString())) {
                return new FirefoxDriver();
            } else if (config.getBrowser().equals(BrowserHW.CHROME.toString())) {
                return new ChromeDriver();
            }
        } else {
            if (config.getBrowser().equals(BrowserHW.FIREFOX.toString())) {
                return new RemoteWebDriver(config.getRemoteURL(), new ChromeOptions());
            } else if (config.getBrowser().equals(BrowserHW.CHROME.toString())) {
                return new RemoteWebDriver(config.getRemoteURL(), new FirefoxOptions());
            }
        }
        throw new NullPointerException("No such browser");
    }
}
