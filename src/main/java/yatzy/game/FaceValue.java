package yatzy.game;

/**
 * Represents the different sides of a die
 */
public enum FaceValue {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);

    private int value;

    FaceValue(int value) {
        this.value = value;
    }

    /**
     * @return the value of a face value
     */
    public int getValue() {
        return value;
    }
}
