package cricket.Bowling;

import cricket.player.Player;

import java.util.HashMap;

public class BowlingStyle {

  public static BowlingStyle getBowlingStyleFor(int type) {
    HashMap<Integer, BowlingStyle> typesOfBowlingStyle = new HashMap<>();
    typesOfBowlingStyle.put(1, new NormalBowlingStyle());
    typesOfBowlingStyle.put(2, new PartTimeBowlingStyle());

    return typesOfBowlingStyle.get(type);
  }

  public boolean hasTakenWicket(Player batsman, int runsLiable) {
    return batsman.isOutFor(runsLiable);
  }

  public boolean isPartTime() {
    return false;
  }
}
