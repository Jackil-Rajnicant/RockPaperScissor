import java.util.Arrays;
import java.util.List;

public class Player {

    private static List<String> options = Arrays.asList("Rock","Paper","Scissors");
    private int userPickNumber = 0;
    private String name = "";
    private String OUTOFINDEXERROR = "Invalid Option";

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getOption(){
        return options.get(userPickNumber);
    }

    public void play(int i) {
        if(i > 2) throw new ArrayIndexOutOfBoundsException(OUTOFINDEXERROR);
        else userPickNumber = i ;
    }


}