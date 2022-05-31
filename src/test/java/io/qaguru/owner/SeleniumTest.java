package io.qaguru.owner;

import io.qaguru.owner.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {

    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGithubTitle() {
        // код выполнения теста
        String title = driver.getTitle().substring(0, 39);
        assertEquals(title, "GitHub: Where the world builds software");
        driver.quit();
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
