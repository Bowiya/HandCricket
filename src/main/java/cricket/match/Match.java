package cricket.match;

import cricket.player.Player;

public class Match {
  private final int overs;
  private final Player firstPlayer;
  private final Player secondPlayer;
  public static final int BALLS_PER_OVER = 6;

  public Match(int overs, Player firstPlayer, Player secondPlayer) {
    this.overs = overs;
    this.firstPlayer = firstPlayer;
    this.secondPlayer = secondPlayer;
  }

  public void play() {
    System.out.println("Innings 1:");
    Innings firstInnings = new Innings(firstPlayer, secondPlayer, true);
    firstInnings.playFor(overs);

    firstPlayer.displayTarget();

    System.out.println("Innings 2:");
    Innings secondInnings = new Innings(secondPlayer, firstPlayer, false);
    secondInnings.playFor(overs);
  }

  public MatchResult result() {
    if (firstPlayer.hasChasedTargetOf(secondPlayer)) {
      return MatchResult.FIRST_PLAYER_WON;
    }
    return MatchResult.SECOND_PLAYER_WON;
  }
}
