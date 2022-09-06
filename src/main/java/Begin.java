import cricket.Batting.BattingStyle;
import cricket.Bowling.BowlingStyle;
import cricket.match.Match;
import cricket.match.MatchResult;
import cricket.player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin {
  static BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException {

    System.out.println("No. of Overs:");
    int overs = Integer.parseInt(inputReader.readLine());

    System.out.println("Player 1:");
    Player firstPlayer = new Player(getBattingStyle(), getBowlingStyle());

    System.out.println("Player 2:");
    Player secondPlayer = new Player(getBattingStyle(), getBowlingStyle());

    Match match = new Match(overs, firstPlayer, secondPlayer);
    match.play();

    MatchResult result = match.result();
    System.out.println(result.toString());
  }

  private static BowlingStyle getBowlingStyle() throws IOException {
    System.out.println("1.Normal Bowler\n2.Part Time Bowler");
    System.out.println("Choose Type of Bowler:");
    int bowlerType = Integer.parseInt(inputReader.readLine());
    return BowlingStyle.getBowlingStyleFor(bowlerType);
  }

  private static BattingStyle getBattingStyle() throws IOException {
    System.out.println("1.Normal Batsman\n2.Hitter\n3.Defensive\n4.Tail Ender");
    System.out.println("Choose Type of Batsman:");
    int batsmanType = Integer.parseInt(inputReader.readLine());
    return BattingStyle.getBattingFor(batsmanType);
  }
}
