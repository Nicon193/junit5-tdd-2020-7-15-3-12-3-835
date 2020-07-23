package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class fizzBuzzWhizzTest {


    @Test
    void should_1_when_fizzBuzzWhizz_play_given_1() {
        //given
        int number =1;
        String actual;
        //when
        fizzBuzzWhizz fbz =new fizzBuzzWhizz();
        actual=fbz.play();
        //then
        Assertions.assertEquals("1",actual);
    }
}
