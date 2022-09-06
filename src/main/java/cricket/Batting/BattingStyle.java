package cricket.Batting;

import cricket.player.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class BattingStyle {
  protected ArrayList<Integer> possibleRuns;

  public static BattingStyle getBattingFor(int type) {
    HashMap<Integer, BattingStyle> typesOfBattingStyles = new HashMap<>();
    typesOfBattingStyles.put(1, new NormalBattingStyle());
    typesOfBattingStyles.put(2, new HitterBattingStyle());
    typesOfBattingStyles.put(3, new DefensiveBattingStyle());
    typesOfBattingStyles.put(4, new TailEnderBattingStyle());

    return typesOfBattingStyles.get(type);
  }

  protected BattingStyle() {
    possibleRuns = new ArrayList<>();
  }

  public int getRunsFor(int index) {
    return possibleRuns.get(index);
  }

  public boolean isOutBy(Player bowler, int runsScored) {
    return bowler.isRunsLiableEqualTo(runsScored);
  }

  public int getNoOfPossibleRuns() {
    return possibleRuns.size();
  }
}
