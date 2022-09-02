package cricket.Bowler;

import cricket.Batsman.*;
import cricket.utils.RunGenerator;

import java.util.HashMap;

public class Bowler {
  protected int runsLiable;

  public static Bowler getBowlerForType(int type) {
    HashMap<Integer, Bowler> typesOfBowler = new HashMap<>();
    typesOfBowler.put(1, new NormalBowler());
    typesOfBowler.put(2, new PartTimeBowler());

    return typesOfBowler.get(type);
  }

  public boolean hasTakenWicketFor(Batsman batsman) {
    return batsman.isOutBy(this);
  }

  public void bowl() {
    int bound = 7;
    runsLiable = RunGenerator.getRun(bound);
  }

  public boolean isPartTime() {
    return false;
  }

  public boolean isRunsLiableEqualTo(int runs) {
    return runsLiable == runs;
  }

  public boolean isRunsEven() {
    return runsLiable % 2 == 0;
  }

  public void displayRunsLiable() {
    System.out.println("Bowler Runs:" + runsLiable);
  }
}
