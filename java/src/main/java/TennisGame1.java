import models.Player;

public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName == player1.getPlayerName()) {
            player1.scorePoint();
        } else {
            player2.scorePoint();
        }
    }

    public String getScore() {
        if (player1.getScore() == player2.getScore()) {
            return draw();
        } else if (player1.getScore() >= 4 || player2.getScore() >= 4)
            return win();
        else
            return getPlayerScore(player1.getScore()) + "-" + getPlayerScore(player2.getScore());
    }

    private String draw() {
        for (DrawStates drawState : DrawStates.values()) {
            if (drawState.getScore() == player1.getScore()) return drawState.getState();
        }
        return DrawStates.DEUCE.getState();
    }

    private String win() {
        int minusResult = player1.getScore() - player2.getScore();

        if (minusResult == 1) return "Advantage player1";
        else if (minusResult == -1) return "Advantage player2";
        else if (minusResult >= 2) return "Win for player1";
        else return "Win for player2";
    }

    private String getPlayerScore(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return null;
        }
    }

}
