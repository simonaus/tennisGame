package models;

public class Player {
    private String playerName;
    private int score;

    public Player(String playerName) {
        this.playerName = playerName;
        score = 0;
    }

    public String getPlayerName(){
        return  playerName;
    }

    public int getScore(){
        return score;
    }

    public void scorePoint() {
        this.score += 1;
    }
}
