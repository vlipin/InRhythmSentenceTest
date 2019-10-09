package com.inrhythm;

import java.util.List;

/**
 * Class that gets and outputs longest words length
 * and list of all longest words of sentence
 */
public class AnalyzedText {
    /** Initializing class fields: word length andwords list*/
    private final int count;
    private final List<String> words;

    /** Constructor to output values of class fields*/
    AnalyzedText(int count, List<String> words) {
        System.out.println(String.format("Count: %d", count));
        this.count = count;
        System.out.println(String.format("Words: %s", words));
        this.words = words;
    }

    /** Longest word length getter
     * @return integer
     * */
    public int getLongestWordLength() {
        return count;
    }

    /** List of longest words getter
     * @return List<String>
     * */
    public List<String> getWords() {
        return words;
    }
}
