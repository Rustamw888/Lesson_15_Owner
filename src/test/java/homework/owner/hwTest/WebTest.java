package homework.owner.hwTest;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTest extends TestBase {

    @Test
    public void testGoogleSearch() {
        assertEquals("Google", title());
    }
}
