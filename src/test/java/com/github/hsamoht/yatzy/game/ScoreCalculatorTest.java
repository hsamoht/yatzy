package com.github.hsamoht.yatzy.game;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ScoreCalculatorTest {
    @Test
    public void scoreOfOnesTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.ONE,
                FaceValue.FOUR,
                FaceValue.THREE,
                FaceValue.ONE,
                FaceValue.FIVE
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(2, scoreCalculator.ones());
    }

    @Test
    public void scoreOfTwosTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.TWO,
                FaceValue.TWO,
                FaceValue.TWO,
                FaceValue.FIVE,
                FaceValue.FIVE
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(6, scoreCalculator.twos());
    }

    @Test
    public void scoreOfThreesTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.ONE,
                FaceValue.TWO,
                FaceValue.TWO,
                FaceValue.THREE,
                FaceValue.FIVE
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(3, scoreCalculator.threes());
    }

    @Test
    public void scoreOfFoursTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.FOUR,
                FaceValue.TWO,
                FaceValue.TWO,
                FaceValue.THREE,
                FaceValue.FOUR
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(8, scoreCalculator.fours());
    }

    @Test
    public void scoreOfFivesTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.FOUR,
                FaceValue.TWO,
                FaceValue.FIVE,
                FaceValue.TWO,
                FaceValue.FOUR
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(5, scoreCalculator.fives());
    }

    @Test
    public void scoreOfSixesTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.TWO,
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.FOUR
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(18, scoreCalculator.sixes());
    }

    @Test
    public void scoreOfOnePairTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.FOUR,
                FaceValue.TWO,
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.FOUR
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(12, scoreCalculator.onePair());
    }

    @Test
    public void notOnePairTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.SIX,
                FaceValue.TWO,
                FaceValue.THREE,
                FaceValue.ONE,
                FaceValue.FIVE,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(0, scoreCalculator.onePair());
    }

    @Test
    public void scoreOfTwoPairTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.FOUR,
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.FOUR
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(20, scoreCalculator.twoPair());
    }

    @Test
    public void notTwoPairTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.SIX,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(0, scoreCalculator.twoPair());
    }

    @Test
    public void scoreOfThreeOfAKindTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.FOUR,
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.SIX,
                FaceValue.FOUR
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(18, scoreCalculator.threeOfAKind());
    }

    @Test
    public void notThreeOfAKindTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.TWO,
                FaceValue.THREE,
                FaceValue.THREE,
                FaceValue.FIVE,
                FaceValue.FIVE,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(0, scoreCalculator.threeOfAKind());
    }

    @Test
    public void scoreOfFourAKindTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.FIVE,
                FaceValue.FIVE,
                FaceValue.FIVE,
                FaceValue.SIX,
                FaceValue.FIVE
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(20, scoreCalculator.fourOfAKind());
    }

    @Test
    public void notFourOfAKindTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.TWO,
                FaceValue.THREE,
                FaceValue.FIVE,
                FaceValue.FIVE,
                FaceValue.FIVE,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(0, scoreCalculator.fourOfAKind());
    }

    @Test
    public void scoreOfSmallStraightTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.ONE,
                FaceValue.TWO,
                FaceValue.THREE,
                FaceValue.FOUR,
                FaceValue.FIVE,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(15, scoreCalculator.smallStraight());
    }

    @Test
    public void notSmallStraightTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.SIX,
                FaceValue.TWO,
                FaceValue.THREE,
                FaceValue.FOUR,
                FaceValue.FIVE,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(0, scoreCalculator.smallStraight());
    }

    @Test
    public void scoreOfLargeStraightTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.TWO,
                FaceValue.THREE,
                FaceValue.FOUR,
                FaceValue.FIVE,
                FaceValue.SIX,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(20, scoreCalculator.largeStraight());
    }

    @Test
    public void notLargeStraightTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.TWO,
                FaceValue.THREE,
                FaceValue.FOUR,
                FaceValue.FIVE,
                FaceValue.FIVE,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(0, scoreCalculator.largeStraight());
    }

    @Test
    public void scoreOfFullHouseTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.TWO,
                FaceValue.TWO,
                FaceValue.FOUR,
                FaceValue.FOUR,
                FaceValue.FOUR,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(16, scoreCalculator.fullHouse());
    }

    @Test
    public void notFullHouseTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.FOUR,
                FaceValue.FOUR,
                FaceValue.FOUR,
                FaceValue.FOUR,
                FaceValue.FOUR,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(0, scoreCalculator.fullHouse());
    }

    @Test
    public void scoreOfChanceTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.ONE,
                FaceValue.TWO,
                FaceValue.SIX,
                FaceValue.FOUR,
                FaceValue.FOUR,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(17, scoreCalculator.chance());
    }

    @Test
    public void scoreOfYatzyTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.ONE,
                FaceValue.ONE,
                FaceValue.ONE,
                FaceValue.ONE,
                FaceValue.ONE,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(50, scoreCalculator.yatzy());
    }

    @Test
    public void notYatzyTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.ONE,
                FaceValue.THREE,
                FaceValue.ONE,
                FaceValue.ONE,
                FaceValue.ONE,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        assertEquals(0, scoreCalculator.yatzy());
    }

    @Test
    public void scoreMapTest() {
        FaceValue[] faceValues = new FaceValue[] {
                FaceValue.ONE,
                FaceValue.THREE,
                FaceValue.ONE,
                FaceValue.ONE,
                FaceValue.ONE,
        };
        ScoreCalculator scoreCalculator = new ScoreCalculator(faceValues);
        Map<ScoreType, Integer> scores = scoreCalculator.scoreMap();
        assertNotNull(scores);
    }
}
