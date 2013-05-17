package com.kata.bowling;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FrameTest {

    @Test
    public void testScoreNoThrows() {
        Frame f = new Frame();
        assertEquals(0, f.getScore() );
    }

    @Test
    public void testAddOneThrow() {
        Frame f = new Frame();
        f.add(5);
        assertEquals(5, f.getScore() );
    }

}
