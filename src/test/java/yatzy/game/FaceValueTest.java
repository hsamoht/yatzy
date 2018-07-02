package yatzy.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FaceValueTest {
    @Test
    public void equalsOneTest() {
        assertEquals(1, FaceValue.ONE.getValue());
    }

    @Test
    public void equalsTwoTest() {
        assertEquals(2, FaceValue.TWO.getValue());
    }

    @Test
    public void equalsThreeTest() {
        assertEquals(3, FaceValue.THREE.getValue());
    }

    @Test
    public void equalsFourTest() {
        assertEquals(4, FaceValue.FOUR.getValue());
    }

    @Test
    public void equalsFiveTest() {
        assertEquals(5, FaceValue.FIVE.getValue());
    }

    @Test
    public void equalsSixTest() {
        assertEquals(6, FaceValue.SIX.getValue());
    }
}
