package homework.owner.hwTest;

import homework.owner.hwConfig.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {

    @Test
    void apiTestCheck() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(config.getBaseUrl()).isEqualTo("https://www.google.com/");
        assertThat(config.getToken()).isEqualTo("1234567890qwerty");
    }
}
