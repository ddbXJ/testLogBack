import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lixuejiao on 16/7/28.
 */
public class TestLogBack {
    private static Logger LOGGER = LoggerFactory.getLogger(TestLogBack.class);
    public static void main(String[] args) {
        LOGGER.trace("======trace");
        LOGGER.debug("======debug");
        LOGGER.info("======info");
        LOGGER.warn("======warn");
        LOGGER.error("======error");
    }
}
