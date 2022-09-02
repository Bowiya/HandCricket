package cricket.Batsman;

import cricket.Bowler.Bowler;
import cricket.utils.RunGenerator;

import java.util.ArrayList;
import java.util.HashMap;

public class Batsman {
  private int totalScore;
  protected ArrayList<Integer> possibleRuns;
  protected int runsScored;

  public static Batsman getBatsmanForType(int type) {
    HashMap<Integer, Batsman> typesOfBatsman = new HashMap<>();
    typesOfBatsman.put(1, new NormalBatsman());
    typesOfBatsman.put(2, new Hitter());
    typesOfBatsman.put(3, new DefensiveBatsman());
    typesOfBatsman.put(4, new TailEnder());

    return typesOfBatsman.get(type);
  }

  protected Batsman() {
    possibleRuns = new ArrayList<>();
  }

  public boolean isOutBy(Bowler bowler) {
    return bowler.isRunsLiableEqualTo(runsScored);
  }

  public void addRunsToScore() {
      totalScore += runsScored;
  }

  public boolean hasChasedTarget(int target) {
    return totalScore >= target;
  }

  private int getNoOfPossibleRuns() {
    return possibleRuns.size();
  }

  public void bat() {
    int bound = getNoOfPossibleRuns();
    int index = RunGenerator.getRun(bound);
    runsScored = possibleRuns.get(index);
  }

  public void displayRunsScored() {
    System.out.println("Batsman Runs:" + runsScored);
  }

  public void displayScore() {
    System.out.println("Total Runs:" + totalScore);
  }
}
