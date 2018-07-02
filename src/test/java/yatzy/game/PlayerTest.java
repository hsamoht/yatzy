package yatzy.game;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void getPlayerNameTest() {
        String name = "Test";
        Player player = new Player(name);
        assertEquals(name, player.getName());
    }

    @Test
    public void defaultScoreTest() {
        Player player = new Player("Test");

        Map<ScoreType, Integer> expected = new HashMap<>();
        expected.put(ScoreType.SUM, 0);
        expected.put(ScoreType.BONUS, 0);
        expected.put(ScoreType.TOTAL, 0);

        assertEquals(expected, player.getScores());
    }

    @Test
    public void setNewScoreTest() {
        Player player = new Player("Test");
        player.setScore(ScoreType.YATZY, 50);

        Map<ScoreType, Integer> expected = new HashMap<>();
        expected.put(ScoreType.SUM, 0);
        expected.put(ScoreType.BONUS, 0);
        expected.put(ScoreType.TOTAL, 0);
        expected.put(ScoreType.YATZY, 50);

        assertEquals(expected, player.getScores());
    }

    @Test
    public void replaceScoreTest() {
        Player player = new Player("Test");
        player.setScore(ScoreType.SUM, 20);

        Map<ScoreType, Integer> expected = new HashMap<>();
        expected.put(ScoreType.SUM, 20);
        expected.put(ScoreType.BONUS, 0);
        expected.put(ScoreType.TOTAL, 0);

        assertEquals(expected, player.getScores());
    }

    @Test
    public void resetScoreTest() {
        Player player = new Player("Test");
        player.setScore(ScoreType.CHANCE, 15);
        player.resetScore();

        Map<ScoreType, Integer> expected = new HashMap<>();
        expected.put(ScoreType.SUM, 0);
        expected.put(ScoreType.BONUS, 0);
        expected.put(ScoreType.TOTAL, 0);

        assertEquals(expected, player.getScores());
    }
}
