public class Game {

    Player playerOne;
    Player playerTwo;


    public Game(Player playerOne, Player playerTwo) {

        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

    }

    public String getResult() {

        if(playerOne.getOption().equals(playerTwo.getOption())) return "Draw";
        else if(playerOne.getOption().equals("Rock") && playerTwo.getOption().equals("Scissors")) return "Rock Win";
        else if(playerOne.getOption().equals("Paper") && playerTwo.getOption().equals("Rock")) return "Paper Win";
        else if(playerOne.getOption().equals("Scissors") && playerTwo.getOption().equals("Paper")) return "Scissors Win";
        else return "";
    }
}
