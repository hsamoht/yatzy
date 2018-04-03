package yatzy;

public class Dice {
    private Die[] dice = new Die[5];

    public Dice() {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
        }
    }

    public Die[] getDice() {
        return dice;
    }

    public void roll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    public int[] getFaceValues() {
        int[] faceValues = new int[dice.length];
        for (int i = 0; i < faceValues.length; i++) {
            faceValues[i] = dice[i].getFaceValue();
        }
        return faceValues;
    }
}
