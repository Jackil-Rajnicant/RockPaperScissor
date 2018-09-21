import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class GameTest {


    Game game;

    Player playerOne;
    Player playerTwo;


    public Game createGame(){

        playerOne = new Player("Jack");
        playerTwo = new Player("Josh");
        return new Game(playerOne,playerTwo);

    }
    @Test
    public void rockBeatsScissors(){

        game = createGame();

        playerOne.play(0);
        playerTwo.play(2);

        assertThat("Rock Win",equalTo(game.getResult()));

    }

    @Test
    public void paperBeatsRock(){

        game = createGame();

        playerOne.play(1);
        playerTwo.play(0);

        assertThat("Paper Win",equalTo(game.getResult()));

    }

    @Test
    public void scissorsBeatsPaper(){

        game = createGame();

        playerOne.play(2);
        playerTwo.play(1);

        assertThat("Scissors Win",equalTo(game.getResult()));

    }

    @Test
    public void drawGame(){

        game = createGame();

        playerOne.play(0);
        playerTwo.play(0);
        assertThat("Draw",equalTo(game.getResult()));

        playerOne.play(1);
        playerTwo.play(1);
        assertThat("Draw",equalTo(game.getResult()));

        playerOne.play(2);
        playerTwo.play(2);
        assertThat("Draw",equalTo(game.getResult()));

    }

    @Test
    public void invalidOption(){
        game = createGame();

        try {
            playerOne.play(4);
            playerTwo.play(1);
            assertThat("Draw",equalTo(game.getResult()));
        }catch (ArrayIndexOutOfBoundsException ex) {
            Assert.assertThat(ex.getMessage(), equalTo("Invalid Option"));
        }
    }
}
