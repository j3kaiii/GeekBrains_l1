package Marathon.Impementation;

import Marathon.Interface.Competitor;
import Marathon.Interface.Obstacle;

public class Course {

    private Obstacle [] obstacles;

    public Course() {
        this.obstacles = new Obstacle[] {new Cross(80), new Wall(2), new Wall(1), new Water(100)};
    }

    public void doIt(Team team) {
        Competitor [] competitors = team.getCompetitors();
        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
