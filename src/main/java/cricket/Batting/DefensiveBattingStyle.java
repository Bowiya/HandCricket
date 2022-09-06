package cricket.Batting;

import java.util.ArrayList;
import java.util.Arrays;

public class DefensiveBattingStyle extends BattingStyle {
  public DefensiveBattingStyle() {
    possibleRuns = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
  }
}
