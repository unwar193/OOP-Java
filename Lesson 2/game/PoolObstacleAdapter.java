package game;

public class PoolObstacleAdapter implements Obstacle {
    
    private final SwimmingPoll swimmingPoll;

    public PoolObstacleAdapter(SwimmingPoll swimmingPoll) {
        this.swimmingPoll = swimmingPoll;
    }

    @Override
    public boolean pass(Participant participant) {
        return swimmingPoll.pass(participant);
    }
}

