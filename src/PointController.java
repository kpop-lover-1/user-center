@RestController
@RequestMapping("/api/points")
public class PointController {
    @Autowired
    private PointService pointService;

    @PostMapping("/login/{userId}")
    public ResponseEntity<?> rewardLogin(@PathVariable Long userId) {
        pointService.rewardLogin(userId);
        return ResponseEntity.ok("奖励成功");
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Integer> getPoints(@PathVariable Long userId) {
        return ResponseEntity.ok(pointService.getPoints(userId));
    }
}