package cricket.Batsman;

import java.util.ArrayList;
import java.util.Arrays;

public class Hitter extends Batsman {
  public Hitter() {
    possibleRuns = new ArrayList<>(Arrays.asList(0, 4, 6));
  }
}
