package cricket.Bowling;

import cricket.player.Player;

public class PartTimeBowlingStyle extends BowlingStyle {
  @Override
  public boolean hasTakenWicket(Player player, int runsLiable) {
    return false;
  }

  @Override
  public boolean isPartTime() {
    return true;
  }
}
