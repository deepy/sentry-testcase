import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestApplication {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("tld.domain.app.parser");

        try {
            throw new Exception("Foo!");
        } catch (Exception e) {
            logger.error("Exception!", e);
        }
    }
}
