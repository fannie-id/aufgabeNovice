package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntermediateTest {
    @Test
    void test_arr_correct(){
        String[] expected = {"eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun","zehn"};
        String[] result = Intermediate.zahlenwortArray();

        assertEquals(expected.length, result.length);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    void when_2_output_zwei(){
        int n = 2;
        String expected = "zwei";
        String result = Intermediate.zahlenWort(n);
        assertEquals(expected,result);
    }

    @Test
    void drei_output_raute_3(){
        int i = 3;
        String expected = "#3";
        String result = Intermediate.convertNum(i);
        assertEquals(expected,result);
    }


}
