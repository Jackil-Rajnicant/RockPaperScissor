import java.util.Arrays;
import java.util.List;

public class Player {

    private static List<String> options = Arrays.asList("Rock","Paper","Scissors");
    private int userPickNumber = 0;
    private String name = "";
    private String OUTOFINDEXERROR = "Invalid Option";

    //constructor
    public Player(String name){
        this.name = name;
    }

    //getter for name
    public String getName(){
        return name;
    }

    //returns the move
    public String getOption(){
        return options.get(userPickNumber);
    }

    //number to indicate which move the chose
    public void play(int i) {
        if(i > 2) throw new ArrayIndexOutOfBoundsException(OUTOFINDEXERROR);
        else userPickNumber = i ;
    }


}
