package com.inrhythm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * jUnit test class, contains most common cases of sentence analysis
 */
public class TextAnalyzerTest {

    /**
     * Test analysis of sentence with 1 longest word
     */
    @Test
    public void testTextWithOneLongestWord() {
        String text = "The cow jumped over the moon.";
        TextAnalyzer analyzer = new TextAnalyzer();
        AnalyzedText analyzedText = analyzer.analyzeText(text);
        // Below are validations of analysis results, message triggers in case of assertion failure
        assertEquals("Longest word length should be 6", 6, analyzedText.getLongestWordLength());
        assertEquals("Amount of longest words should be 1", 1, analyzedText.getWords().size());
        assertTrue("Longest words should contain 'jumped' ", analyzedText.getWords().contains("jumped"));
    }

    /**
     * Test analysis of sentence with several longest words
     */
    @Test
    public void testTextWithMultipleLongestWords() {
        String text = "Lorem Ipsum is dummy text";
        TextAnalyzer analyzer = new TextAnalyzer();
        AnalyzedText analyzedText = analyzer.analyzeText(text);
        // Below are validations of analysis results, message triggers in case of assertion failure
        assertEquals("Longest words length should be 5", 5, analyzedText.getLongestWordLength());
        assertEquals("Amount of longest words should be 3", 3, analyzedText.getWords().size());
        assertTrue("Longest words should contain 'lorem' ", analyzedText.getWords().contains("lorem"));
        assertTrue("Longest words should contain 'ipsum' ", analyzedText.getWords().contains("ipsum"));
        assertTrue("Longest words should contain 'dummy' ", analyzedText.getWords().contains("dummy"));
    }

    /**
     * Test analysis of sentence with punctuations
     */
    @Test
    public void testTextWithPunctuation() {
        String text = "Translations: Can you help translate this site into a foreign language? " +
                "Please email us with details if you can help.";
        TextAnalyzer analyzer = new TextAnalyzer();
        AnalyzedText analyzedText = analyzer.analyzeText(text);
        // Below are validations of analysis results, message triggers in case of assertion failure
        assertEquals("Longest word length should be 12", 12, analyzedText.getLongestWordLength());
        assertEquals("Amount of longest words should be 1", 1, analyzedText.getWords().size());
        assertTrue("Longest words should contain 'translations' ", analyzedText.getWords().contains("translations"));
    }

    /**
     * Test analysis of string without any text (empty sentence)
     */
    @Test
    public void testEmptyText() {
        String text = "";
        TextAnalyzer analyzer = new TextAnalyzer();
        AnalyzedText analyzedText = analyzer.analyzeText(text);
        assertEquals("Longest word length should be 0", 0, analyzedText.getLongestWordLength());
        assertEquals("Amount of longest words should be 1", 1, analyzedText.getWords().size());
        assertTrue("Longest words should contain empty string: '' ", analyzedText.getWords().contains(""));
    }

    /**
     * Test that catches expected IllegalStateException
     */
    @Test(expected = IllegalStateException.class)
    public void testNotDefinedText() {
        TextAnalyzer analyzer = new TextAnalyzer();
        analyzer.analyzeText(null);
    }
}
