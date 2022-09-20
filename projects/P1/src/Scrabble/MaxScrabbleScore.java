package Scrabble;

import java.util.HashMap;

public class MaxScrabbleScore extends TextFileAccessor {
    int bestScore = 0;
    String bestLine;

    HashMap<Character, Integer> pointValue = new HashMap<Character, Integer>() {{
        put('a', 1);
        put('b', 3);
        put('c', 3);
        put('d', 2);
        put('e', 1);
        put('f', 4);
        put('g', 2);
        put('h', 4);
        put('i', 1);
        put('j', 8);
        put('k', 5);
        put('l', 1);
        put('m', 3);
        put('n', 1);
        put('o', 1);
        put('p', 3);
        put('q', 10);
        put('r', 1);
        put('s', 1);
        put('t', 1);
        put('u', 1);
        put('v', 4);
        put('w', 4);
        put('x', 8);
        put('y', 4);
        put('z', 10);
    }};

    private void processLine(String line) {
        int i = 0;
        int score = 0;
        for (char c : line.toCharArray()) {
            score += pointValue.get(c);
        }
        if (score > this.bestScore) {

            this.bestScore = score;
            this.bestLine = line;
        }
    }

    public String getReportStr(){
        return "SCREAM Max scrabble score: %d for this line: %s".formatted(bestScore, bestLine);
    }
}