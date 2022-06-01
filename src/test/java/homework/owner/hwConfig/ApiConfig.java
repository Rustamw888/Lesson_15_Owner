package homework.owner.hwConfig;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:/tmp/tokens.properties",
        "classpath:config/api.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://www.google.com/")
    String getBaseUrl();

    @Key("token")
    @DefaultValue("1234567890qwerty")
    String getToken();
}
