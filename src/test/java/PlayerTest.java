import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PlayerTest {

    Player player = new Player("Kate");

    @Test
    public void getNameTest(){
        assertThat("Kate",equalTo(player.getName()));
    }

    @Test
    public void getOptionRock(){
        player.play(0);
        assertThat("Rock",equalTo(player.getOption()));
    }

    @Test
    public void getOptionPaper(){
        player.play(1);
        assertThat("Paper",equalTo(player.getOption()));
    }

    @Test
    public void getOptionScissors(){
        player.play(2);
        assertThat("Scissors",equalTo(player.getOption()));
    }
}
