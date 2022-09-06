package cricket.Batting;

import java.util.ArrayList;
import java.util.Arrays;

public class NormalBattingStyle extends BattingStyle {
  public NormalBattingStyle() {
    possibleRuns = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
  }
}
