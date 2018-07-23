package Patterns.Factory.MatchFactory;

public class Match {

    private int point1;
    private int point2;

    public int getPoint1() {
        return point1;
    }

    Match() {
    }

    Match(int point1, int point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public void setPoint1(int point1) {
        this.point1 = point1;
    }
}
