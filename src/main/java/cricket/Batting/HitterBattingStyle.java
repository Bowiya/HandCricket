package cricket.Batting;

import java.util.ArrayList;
import java.util.Arrays;

public class HitterBattingStyle extends BattingStyle {
  public HitterBattingStyle() {
    possibleRuns = new ArrayList<>(Arrays.asList(0, 4, 6));
  }
}
