import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointServiceTest {
    @Test
    public void testLoginReward() {
        PointService service = new PointServiceImpl();
        service.rewardLogin(1001L);
        assertEquals(1, service.getPoints(1001L));
    }

    @Test
    public void testConsumeReward() {
        PointService service = new PointServiceImpl();
        service.rewardConsume(1001L, 250);
        assertEquals(20, service.getPoints(1001L)); // 250/100*10=20
    }
}