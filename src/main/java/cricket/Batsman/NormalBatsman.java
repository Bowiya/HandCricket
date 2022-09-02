package cricket.Batsman;

import java.util.ArrayList;
import java.util.Arrays;

public class NormalBatsman extends Batsman {
  public NormalBatsman() {
    possibleRuns = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
  }
}
