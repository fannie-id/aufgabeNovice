package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NoviceTest {
    @Test
    void output_name(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(outContent));
        Novice.showName();

        assertEquals("""
                my name is Fangfang
                my name is Fangfang
                my name is Fangfang
                my name is Fangfang
                my name is Fangfang
                """,outContent.toString());
        System.setOut(originalOut);
    }

    @Test
    void when_bigger_than_0_output_true(){
        int num = 3;

        assertTrue(Novice.isBiggerThanZero(num));

    }

    @Test
    void output_square(){
        int num = 4;
        int expected = 16;

        int result = Novice.calSquare(num);

        assertEquals(expected,result);
    }

    @Test
    void output_greeting(){
        String name ="hanna";
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(outContent));

        Novice.sayHallo();
        assertEquals("bitte geben Sie ihr Namen\nGuten Abend! " + name + "\n", outContent.toString());
        System.setOut(originalOut);
        System.setIn(sysInBackup);
    }
}