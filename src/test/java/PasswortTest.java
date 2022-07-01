import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class PasswortTest {
    @Test
    void TestEasyPasswordYes(){
        // given
        String given="Passwort";
        // when
        boolean actual=Passwort.isPasswordForbidden(given);
        // then
        Assertions.assertEquals(actual,true);
    }
    @Test
    void TestEasyPasswordNo(){
        // given
        String given="ganz schwierig";
        // when
        boolean actual=Passwort.isPasswordForbidden(given);
        // then
        Assertions.assertEquals(actual,false);
    }
    @Test
    void TestMinuskelYes(){
        // given
        String given="HG45ddD";
        // when
        boolean actual=Passwort.isMinuskelInPassword(given);
        // then
        Assertions.assertEquals(actual,true);
    }
    @Test
    void TestMinuskelNo(){
        // given
        String given="HGT33ZH";
        // when
        boolean actual=Passwort.isMinuskelInPassword((given));
        // then
        Assertions.assertEquals(actual,false);
    }
    @Test
    void TestZifferJa(){
        // given
        String given="hfg2ff";
        // when
        boolean actual=Passwort.isNumberInPassword(given);
        // then
        Assertions.assertEquals(actual,true);
    }
    @Test
    void TestZfferNein(){
        // given
        String given="dsasd";
        // when
        boolean actual=Passwort.isNumberInPassword(given);
        // then
        Assertions.assertEquals(actual,false);
    }
    @Test
    void TestMajuskelYes(){
        // given
        String given="dsFss2";
        // when
        boolean actual=Passwort.isMajuskelInPassword(given);
        // then
        Assertions.assertEquals(actual,true);
    }
    @Test
    void TestMajuskelNo(){
        // given
        String given="dsa23234";
        // when
        boolean actual=Passwort.isMajuskelInPassword(given);
        // then
        Assertions.assertEquals(actual,false);
    }
   /* @Test
      void Test1() {



        // given
        String input="password1";

        // when
        boolean actual=Passwort.isPasswordStrong(input);

        // then
        Assertions.assertEquals(true,actual);
    }
    @Test
    void TestLength7(){
        // given
        String input="sdfguik";
        // when
        boolean actual = Passwort.isPasswordLongEnough(input);
        // then
        Assertions.assertEquals(false,actual);
    }
    @Test
    void TestLenghth8(){
        // given
        String input="lkjhuztf";
        // when
        boolean actual=Passwort.isPasswordLongEnough(input);
        // then
        Assertions.assertEquals(false,actual);
    }
    */

    @Test
    void TestLengthc8(){
        // given
        String input="defgthjk";
        // when
        int actual=Passwort.countPasswordLength(input);
        // then
        Assertions.assertEquals(8,actual);


    }
    @Test
    void TestLengthc7(){
        //given
        String input="dreghtg";
        // when
        int actual=Passwort.countPasswordLength(input);
        // then
        Assertions.assertEquals(7,actual);
    }
}