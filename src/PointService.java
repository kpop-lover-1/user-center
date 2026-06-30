public interface PointService {
    // 用户登录奖励
    void rewardLogin(Long userId);
    
    // 消费奖励
    void rewardConsume(Long userId, int amount);
    
    // 查询积分
    int getPoints(Long userId);
}