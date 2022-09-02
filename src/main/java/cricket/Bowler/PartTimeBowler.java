package cricket.Bowler;

import cricket.Batsman.Batsman;

public class PartTimeBowler extends Bowler {
  @Override
  public boolean hasTakenWicketFor(Batsman batsman) {
    return false;
  }

  @Override
  public boolean isPartTime() {
    return true;
  }
}
