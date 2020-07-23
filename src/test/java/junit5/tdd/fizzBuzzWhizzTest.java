package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fizzBuzzWhizzTest {


    @Test
    void should_1_when_fizzBuzzWhizz_play_given_1() {
        //given
        int number =1;
        String actual;
        //when
        fizzBuzzWhizz fbz =new fizzBuzzWhizz();
        actual=fbz.play(number);
        //then
        assertEquals("1",actual);
    }

    @Test
    void should_Fizz_when_fizzBuzzWhizz_play_given_3() {
        //given
        int number =3;
        String actual;
        //when
        fizzBuzzWhizz fbz =new fizzBuzzWhizz();
        actual=fbz.play(number);
        //then
        assertEquals("Fizz",actual);
    }

    @Test
    void should_Buzz_when_fizzBuzzWhizz_play_given_5() {
        //given
        int number =5;
        String actual;

        //when
        fizzBuzzWhizz fbz =new fizzBuzzWhizz();
        actual=fbz.play(number);

        //then
        assertEquals("Buzz",actual);
    }

    @Test
    void should_Whizz_when_fizzBuzzWhizz_play_given_7() {
        //given
        int number =7;
        String actual;

        //when
        fizzBuzzWhizz fbz =new fizzBuzzWhizz();
        actual=fbz.play(number);

        //then
        assertEquals("Whizz",actual);
    }

    @Test
    void should_FizzBuzzWhizz_when_fizzBuzzWhizz_play_given_105() {
        //given
        int number =105;
        String actual;

        //when
        fizzBuzzWhizz fbz =new fizzBuzzWhizz();
        actual=fbz.play(number);

        //then
        assertEquals("FizzBuzzWhizz",actual);
    }

}
