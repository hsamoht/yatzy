package com.github.hsamoht.yatzy.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreTypeTest {
    @Test
    public void nextScoreTypeTest() {
        ScoreType scoreType = ScoreType.ONES;
        ScoreType next = scoreType.next();
        assertEquals(ScoreType.TWOS, next);
    }

    @Test
    public void nextScoreTypeLoopTest() {
        ScoreType scoreType = ScoreType.TOTAL;
        ScoreType next = scoreType.next();
        assertEquals(ScoreType.ONES, next);
    }
}
