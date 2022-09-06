package cricket.match;

import cricket.player.Player;

import static cricket.match.Match.BALLS_PER_OVER;

public class Innings {
  private final Player batsman;
  private final Player bowler;
  private final boolean isFirst;

  public Innings(Player batsman, Player bowler, boolean isFirst) {
    this.batsman = batsman;
    this.bowler = bowler;
    this.isFirst = isFirst;
  }

  public void playFor(int overs) {
    for (int ballNumber = 0; ballNumber < overs * BALLS_PER_OVER; ballNumber++) {
      batsman.bat();
      bowler.bowl();

      displayRuns();

      boolean isBatsmanOut = batsman.isOutBy(bowler);
      boolean hasBowlerTakenWicket = bowler.hasTakenWicketOf(batsman);
      boolean isOut = isBatsmanOut && hasBowlerTakenWicket;

      if (!shouldNotAddRuns(isBatsmanOut)) {
        batsman.addRunsToScore();
      }
      batsman.displayScore();

      if (isOut || (!isFirst && batsman.hasChasedTargetOf(bowler))) {
        break;
      }
    }
  }

  private boolean shouldNotAddRuns(boolean isBatsmanOut) {
    return isBatsmanOut && bowler.isPartTime();
  }

  private void displayRuns() {
    batsman.displayRunsScored();
    bowler.displayRunsLiable();
  }
}
