package cricket.Batsman;

import java.util.ArrayList;
import java.util.Arrays;

public class DefensiveBatsman extends Batsman {
  public DefensiveBatsman() {
    possibleRuns = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
  }
}
