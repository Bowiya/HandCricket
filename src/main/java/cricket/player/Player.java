package cricket.player;

import cricket.Batting.BattingStyle;
import cricket.Bowling.BowlingStyle;
import cricket.utils.Utils;

public class Player {
  private final BowlingStyle bowlingStyle;
  private final BattingStyle battingStyle;
  private int totalScore;
  private int runsScored;
  private int runsLiable;

  public Player(BattingStyle battingStyle, BowlingStyle bowlingStyle) {
    this.bowlingStyle = bowlingStyle;
    this.battingStyle = battingStyle;
  }

  public void bat() {
    int bound = battingStyle.getNoOfPossibleRuns();
    int index = Utils.getRun(bound);
    runsScored = battingStyle.getRunsFor(index);
  }

  public void bowl() {
    int bound = 7;
    runsLiable = Utils.getRun(bound);
  }

  public void displayRunsScored() {
    System.out.println("Batsman Runs:" + runsScored);
  }

  public void displayScore() {
    System.out.println("Total Runs:" + totalScore);
  }

  public void displayTarget() {
    System.out.println("Target:" + getTarget());
    System.out.println();
  }

  public void displayRunsLiable() {
    System.out.println("Bowler Runs:" + runsLiable);
  }

  public boolean isOutBy(Player bowler) {
    return battingStyle.isOutBy(bowler, runsScored);
  }

  public boolean isRunsLiableEqualTo(int runsScored) {
    return runsLiable == runsScored;
  }

  public int getRunsLiableModulusTwo() {
    return Utils.getNumberModulusTwo(runsLiable);
  }

  public boolean isPartTime() {
    return bowlingStyle.isPartTime();
  }

  public boolean hasTakenWicketOf(Player batsman) {
    return bowlingStyle.hasTakenWicket(batsman, runsLiable);
  }

  public void addRunsToScore() {
    totalScore += runsScored;
  }

  public boolean hasChasedTargetOf(Player player) {
    return totalScore >= player.getTarget();
  }

  private int getTarget() {
    return totalScore + 1;
  }

  public boolean isOutFor(int runsLiable) {
    return runsScored == runsLiable;
  }
}
