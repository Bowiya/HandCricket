import cricket.Batsman.Batsman;
import cricket.Bowler.Bowler;
import cricket.match.Match;
import cricket.match.MatchResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin {
  public static void main(String[] args) throws IOException {
    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("No. of Overs:");
    int overs = Integer.parseInt(inputReader.readLine());

    System.out.println("Target:");
    int target = Integer.parseInt(inputReader.readLine());

    System.out.println("1.Normal Batsman\n2.Hitter\n3.Defensive\n4.Tail Ender");
    System.out.println("Choose Type of Batsman:");
    int batsmanType = Integer.parseInt(inputReader.readLine());
    Batsman batsman = Batsman.getBatsmanForType(batsmanType);

    System.out.println("1.Normal Bowler\n2.Part Time Bowler");
    System.out.println("Choose Type of Bowler:");
    int bowlerType = Integer.parseInt(inputReader.readLine());
    Bowler bowler = Bowler.getBowlerForType(bowlerType);

    Match match = new Match(overs, target, batsman, bowler);
    match.play();

    MatchResult result = match.result();
    System.out.println();
    System.out.println(result.toString());
  }
}
