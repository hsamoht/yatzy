package com.github.hsamoht.yatzy.game;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DieTest {
    @Test
    public void initFaceValueStateTest() {
        Die die = new Die();
        assertEquals(null, die.getFaceValue());
    }

    @Test
    public void initSelectedStateTest() {
        Die die = new Die();
        assertEquals(false, die.isSelected());
    }

    @Test
    public void changeSelectedStateTest() {
        Die die = new Die();
        die.setSelected(true);
        assertEquals(true, die.isSelected());
    }

    @Test
    public void rollTest() {
        Die die = new Die();
        die.roll();
        assertThat(die.getFaceValue(), instanceOf(FaceValue.class));
    }
}
