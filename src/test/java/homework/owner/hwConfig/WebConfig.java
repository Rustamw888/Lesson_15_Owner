package homework.owner.hwConfig;

import org.aeonbits.owner.Config;

import java.net.URL;

//@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${start}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("101.0")
    String getBrowserVersion();

    @Key("remoteWebDriver")
    String getRemoteWebDriver();

    @Key("remoteURL")
    URL getRemoteURL();

    @Key("baseUrl")
    @DefaultValue("https://www.google.com/")
    String getBaseURL();

}
