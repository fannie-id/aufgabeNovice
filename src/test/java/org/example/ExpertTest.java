package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpertTest {

    @Test
    void qwert_output_trewq(){
        String str ="qwert";
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes());
        System.setIn(in);

        String result = Expert.reversEingabe();

        String expected = "trewq";
        assertEquals(expected, result);
        System.setIn(sysInBackup);
    }

    @Test
    void seperate_text(){
        String text ="jsad, dsad";
        String[] expected = {"jsad","dsad"};
        String[] result = Expert.seperateText(text);
        assertEquals(expected.length, result.length);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
    @Test
    void when_one_two_three_output_six(){
        int input = 123;
        int expected = 6;
        int result =Expert.crossSum1(input);
        assertEquals(expected,result);
    }

    @Test
    void when_sieben_acht_output_LXXVIII(){
        int input = 78;
        String expected = "LXXVIII";
        String result =Expert.romaZahl(input);
        assertEquals(expected,result);
    }

}
