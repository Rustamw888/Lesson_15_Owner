package io.qaguru.owner.config;

import java.util.Objects;

public class WebDriverConfig {

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
