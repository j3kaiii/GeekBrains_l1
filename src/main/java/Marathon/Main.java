package Marathon;

import Marathon.Impementation.*;

import Marathon.Interface.Obstacle;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("MyTeam");
        Course c = new Course();

        c.doIt(team);

        team.ShowResults();

    }
}