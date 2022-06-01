package homework.owner.helpers;

import homework.owner.hwConfig.ApiConfig;
import org.aeonbits.owner.ConfigFactory;

public class ApiProvider {

    public static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
}
