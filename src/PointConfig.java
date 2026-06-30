@Configuration
public class PointConfig {
    @Value("${point.login}")
    private int loginReward = 1;

    @Value("${point.consume.ratio}")
    private int consumeRatio = 10; // 每消费100元奖励10积分

    public int getLoginReward() {
        return loginReward;
    }

    public int getConsumeRatio() {
        return consumeRatio;
    }
}