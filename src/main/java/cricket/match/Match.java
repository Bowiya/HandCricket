package cricket.match;

import cricket.Batsman.Batsman;
import cricket.Bowler.Bowler;

public class Match {
  private final int overs;
  private final int target;
  private final Batsman batsman;
  private final Bowler bowler;
  public static final int BALLS_PER_OVER = 6;

  public Match(int overs, int target, Batsman batsman, Bowler bowler) {
    this.overs = overs;
    this.target = target;
    this.batsman = batsman;
    this.bowler = bowler;
  }

  public void play() {
    for (int ballNumber = 0; ballNumber <= overs * BALLS_PER_OVER; ballNumber++) {
      batsman.bat();
      bowler.bowl();

      displayRuns();

      boolean isBatsmanOut = batsman.isOutBy(bowler);
      boolean hasBowlerTakenWicket = bowler.hasTakenWicketFor(batsman);
      boolean isOut = isBatsmanOut && hasBowlerTakenWicket;

      if (!(isBatsmanOut && bowler.isPartTime())) {
        batsman.addRunsToScore();
      }
      batsman.displayScore();

      if (batsman.hasChasedTarget(target) || isOut) {
        break;
      }
    }
  }

  public MatchResult result() {
    if (batsman.hasChasedTarget(target)) {
      return MatchResult.BATSMAN_HAS_WON;
    }
    return MatchResult.BATSMAN_HAS_LOST;
  }

  public void displayRuns() {
    System.out.println();
    batsman.displayRunsScored();
    bowler.displayRunsLiable();
  }
}
