package Patterns.Factory.MatchFactory;

public class Main {

    public static void main(String[] args){

        Match newMatch = MatchFactory.StartNew();

        Match resumedMatch = MatchFactory.ResumeMatch(3, 5);
    }
}
