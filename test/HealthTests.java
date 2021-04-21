import health.Health;
import org.junit.jupiter.api.Test;

public class HealthTests {
    @Test
    void mainTest(){
        Health health = new Health();
        Health.main(null);
    }
}
