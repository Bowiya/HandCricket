package cricket.Batting;

import cricket.player.Player;
import cricket.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;

public class TailEnderBattingStyle extends BattingStyle {
  public TailEnderBattingStyle() {
    possibleRuns = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
  }

  @Override
  public boolean isOutBy(Player bowler, int runsScored) {
    return Utils.getNumberModulusTwo(runsScored) == bowler.getRunsLiableModulusTwo();
  }
}
