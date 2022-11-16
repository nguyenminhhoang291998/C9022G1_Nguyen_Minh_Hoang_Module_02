package ss8.bai_tap.Refactoring;

public class TennisGame {
    public static String getScore(int player1Score, int player2Score) {
        String score = "";
        boolean isEqualScore = player1Score == player2Score;
        boolean isWinner = player1Score >=4 || player2Score >=4;

        if (isEqualScore) {
            score = equalScore(player1Score);}
        else if (isWinner) {
            score = getWinner(player1Score,player2Score);}
        else {
            score = getRatio(player1Score,player2Score);}
        return score;
    }
    public static String equalScore(int player1Score){
        switch (player1Score)
        {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return  "Deuce";
        }

    }

    public static String getWinner(int player1Score, int player2Score){
        int minusResult = player1Score - player2Score;
        if (minusResult==1) {
            return "Advantage player1";
        } else if (minusResult ==-1) {
            return "Advantage player2";
        } else if (minusResult>=2) {
            return  "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    public static String getRatio(int player1Score, int player2Score){
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = player1Score;
            else { score.append("-");
                tempScore = player2Score;}
            switch(tempScore)
            {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
            }
        }
        return score.toString();
    }

    public static void main(String[] args) {
        System.out.println(getRatio(2,1));
    }
}
