public class ChallengeMethods {
    public static void main(String[] args) {
        int pos = calculateHighScorePosition(1000);
        displayHighScorePosition("Riyaz",pos);

        pos = calculateHighScorePosition(500);
        displayHighScorePosition("Tim",pos);

        pos = calculateHighScorePosition(100);
        displayHighScorePosition("Bob",pos);

        pos = calculateHighScorePosition(50);
        displayHighScorePosition("Stark",pos);
    }
    public static void displayHighScorePosition(String player_name, int position) {
        System.out.println(player_name+" managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; //assuming position 4 would be returned.
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

}
