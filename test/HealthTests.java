import health.Health;
import org.junit.jupiter.api.Test;

public class HealthTests {
    // test Health main class
    @Test
    void mainTest(){
        Health health = new Health();
        Health.main(null);
    }
}
