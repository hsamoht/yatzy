package yatzy.game;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class DiceTest {
    @Test
    public void initFaceValueTest() {
        Dice dice = new Dice();
        FaceValue[] faceValues = dice.getFaceValues();
        FaceValue[] expected = new FaceValue[] {null, null, null, null, null};
        assertArrayEquals(expected, faceValues);
    }

    @Test
    public void getFirstDieTest() {
        Dice dice = new Dice();
        Die die = dice.getDie(0);
        assertNotNull(die);
    }

    @Test
    public void getLastDieTest() {
        Dice dice = new Dice();
        Die die = dice.getDie(4);
        assertNotNull(die);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void getDieOutOfIndexTest() {
        Dice dice = new Dice();
        Die die = dice.getDie(5);
    }

    @Test
    public void checkNumberOfDiceTest() {
        Dice dice = new Dice();
        assertEquals(5, dice.getDice().length);
    }

    @Test
    public void rollAllDiceTest() {
        Dice dice = new Dice();
        dice.roll();
        Collection<FaceValue> faceValues = Arrays.asList(dice.getFaceValues());
        assertThat(faceValues, hasItem(notNullValue(FaceValue.class)));
    }
}
