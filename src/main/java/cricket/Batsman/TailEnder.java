package cricket.Batsman;

import cricket.Bowler.Bowler;

import java.util.ArrayList;
import java.util.Arrays;

public class TailEnder extends Batsman {
  public TailEnder() {
    possibleRuns = new ArrayList<>(Arrays.asList(0, 4, 6));
  }

  @Override
  public boolean isOutBy(Bowler bowler) {
    return areBothRunsEven(bowler) || areBothRunsOdd(bowler);
  }

  private boolean areBothRunsEven(Bowler bowler) {
    return isEven(runsScored) && bowler.isRunsEven();
  }

  private boolean areBothRunsOdd(Bowler bowler) {
    return !isEven(runsScored) && !bowler.isRunsEven();
  }

  private boolean isEven(int number) {
    return number % 2 == 0;
  }
}
