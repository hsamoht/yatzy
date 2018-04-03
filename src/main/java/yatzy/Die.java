package yatzy;

import java.util.Random;

public class Die {
    private static int MAXIMUM_FACE_NUMBER = 6;

    private int faceValue;

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        int faceValue = new Random().nextInt(MAXIMUM_FACE_NUMBER) + 1;
        setFaceValue(faceValue);
    }

    private void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

}
