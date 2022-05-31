package io.qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("FIREFOX")
    Browser getBrowser();

    // зачитываем данные из командной строки
    @Key("remoteUrl")
    // обрабатываем дефолтное значение
    @DefaultValue("https://localhost:4444/wd/hub")
    // конвертируем в возвращаемый тип
    URL getRemoteURL();
}
