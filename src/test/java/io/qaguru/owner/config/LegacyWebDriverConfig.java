package io.qaguru.owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LegacyWebDriverConfig {

    public URL getRemoteUrl() {
        // зачитываем данные из командной строки
        String remoteUrl = System.getProperty("remoteUrl");
        // обрабатываем дефолтное значение
        if (Objects.isNull(remoteUrl)) {
            remoteUrl = "https://selenium:4444/wd/hub";
        }
        // конвертируем в возвращаемый тип
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String getBaseUrl() {
        // зачитываем данные из командной строки
        String baseUrl = System.getProperty("baseUrl");
        // обрабатываем дефолтное значение
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }
        // конвертируем в возвращаемый тип
        return baseUrl;
    }

    public Browser getBrowser() {
        // зачитываем данные из командной строки
        String browser = System.getProperty("browser");
        // обрабатываем дефолтное значение
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }
        // конвертируем в возвращаемый тип
        return Browser.valueOf(browser);
    }
}
