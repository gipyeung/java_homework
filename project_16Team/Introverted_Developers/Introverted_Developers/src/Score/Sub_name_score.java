package Score;

public class Sub_name_score {

    private int round;
    private String Sub_name;
    private int score;

    public Sub_name_score(int Sub_round, String Sub_name, int Sub_score) {
        this.round = Sub_round;
        this.Sub_name = Sub_name;
        this.score = Sub_score;
    }

    public int getRound() {return round;}
    public String getName() {return Sub_name;}
    public int getScore() {return score;}

    public void setScore(int score) {this.score = score;}

    @Override
    public String toString() {
        return Sub_name + " " + round +"회차"+" " + score+"점";
    }
}
