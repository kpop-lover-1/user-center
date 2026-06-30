public class PointServiceImpl implements PointService {
    private Map<Long, Integer> pointsDB = new HashMap<>();

    @Override
    public void rewardLogin(Long userId) {
        pointsDB.put(userId, pointsDB.getOrDefault(userId, 0) + 1);
        System.out.println("用户 " + userId + " 登录奖励 1 积分");
    }

    @Override
    public void rewardConsume(Long userId, int amount) {
        int reward = amount / 100 * 10; // 每消费100元奖10积分
        pointsDB.put(userId, pointsDB.getOrDefault(userId, 0) + reward);
        System.out.println("用户 " + userId + " 消费奖励 " + reward + " 积分");
    }

    @Override
    public int getPoints(Long userId) {
        return pointsDB.getOrDefault(userId, 0);
    }
}