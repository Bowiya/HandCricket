package cricket.match;

public enum MatchResult {
  BATSMAN_HAS_WON("Batsman has Won"),
  BATSMAN_HAS_LOST("Batsman has Lost");

  private final String value;

  MatchResult(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
