package cricket.match;

public enum MatchResult {
  FIRST_PLAYER_WON("First Player has Won"),
  SECOND_PLAYER_WON("Second Player has Won");

  private final String value;

  MatchResult(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
