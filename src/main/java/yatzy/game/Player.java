package yatzy.game;

import java.util.EnumMap;
import java.util.Map;

public class Player {
    private final String name;
    private Map<ScoreType, Integer> scores = new EnumMap<>(ScoreType.class);

    public Player(String name) {
        this.name = name;

        defaultScore();
    }

    public Map<ScoreType, Integer> getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }

    public void setScore(ScoreType scoreType, int score) {
        if (scores.containsKey(scoreType)) {
            scores.replace(scoreType, score);
        } else {
            scores.put(scoreType, score);
        }
    }

    public void resetScore() {
        scores = new EnumMap<>(ScoreType.class);
        defaultScore();
    }

    private void defaultScore() {
        scores.put(ScoreType.SUM, 0);
        scores.put(ScoreType.BONUS, 0);
        scores.put(ScoreType.TOTAL, 0);
    }
}
