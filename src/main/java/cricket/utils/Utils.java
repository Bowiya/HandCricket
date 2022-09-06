package cricket.utils;

public class Utils {
  public static int getRun(int bound) {
    return (int) (Math.random() * bound);
  }

  public static int getNumberModulusTwo(int runsLiable) {
    return runsLiable % 2;
  }
}
