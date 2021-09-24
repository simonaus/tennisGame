public enum DrawStates {
    LOVEALL(0, "Love-All"),
    FIFTEENALL(1, "Fifteen-All"),
    THIRTYALL(2, "Thirty-All"),
    DEUCE(3, "Deuce");

    private final int score;
    private final String state;

    DrawStates(int score, String state) {
        this.score = score;
        this.state = state;
    }

    public int getScore() {
        return score;
    }

    public String getState() {
        return state;
    }
}