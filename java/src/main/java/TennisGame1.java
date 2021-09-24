
public class TennisGame1 implements TennisGame {
    
    private int m_score1 = 0; //what is an m-score? Variables should be renamed
    private int m_score2 = 0;
    private String player1Name; //should this be an enum or a class?
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name; //make name a variable of the class
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) { //if player is an object, can just say, player1.score++
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() { //pull out methods, ie. check for draw(), check for win()
        String score = "";
        int tempScore=0; //variable naming? what is a temp score?
        if (m_score1==m_score2) {
            return draw();
        }
        else if (m_score1>=4 || m_score2>=4)
            return win();
        else
        {
            for (int i=1; i<3; i++) //this is going through this twice, insted make it a function, assign score to player
            {
                if (i==1) tempScore = m_score1;
                else { score+="-"; tempScore = m_score2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score; //put this return throughout the function to avoid a lot of the if statements
    }

    private String draw() {
            switch (m_score1)
            {
                case 0: //could turn this into an array with index and score names
                        return "Love-All";
                case 1:
                        return "Fifteen-All";
                case 2:
                        return "Thirty-All";
                default:
                        return "Deuce";
            }
    }

    private String win() {
            int minusResult = m_score1-m_score2; //rename this variable

            if (minusResult==1) return "Advantage player1";
            else if (minusResult ==-1) return "Advantage player2";
            else if (minusResult>=2) return "Win for player1";
            else return "Win for player2";
    }
}
