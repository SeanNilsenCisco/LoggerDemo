import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerTest {

    private static final Logger logger = LogManager.getRootLogger();

    public static void main(String[] args){
        try {
            System.out.println("Start");
            logger.info("Do main");
        } catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
