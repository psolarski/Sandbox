package Patterns.Factory.MatchFactory;

public class MatchFactory {

    public static Match StartNew() {

        return new Match();
    }

    public static Match ResumeMatch(int point1, int point2) {

        return new Match(point1, point2);
    }
}
