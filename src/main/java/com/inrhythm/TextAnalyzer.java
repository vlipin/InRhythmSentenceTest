package com.inrhythm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class that implements logic of sentence analysis
 */
public class TextAnalyzer {

    /** List of longest words getter
     * @param text - sentence of String type
     * @return AnalyzedText object - object of AnalyzedText class with needed values
     * */
    public AnalyzedText analyzeText(String text) {
        System.out.println(String.format("Analyzing: %s", text)); //outputs input sentence string
        if (text == null) {
            throw new IllegalStateException("Text is not defined"); //catching IllegalStateException if text is not defined
        } else {
            String textWithoutPunctuation = text.replaceAll("[^a-zA-Z ]", "").toLowerCase(); // removes all special chars and set all words to lower case in sentence
            Map.Entry<Integer, List<String>> results = Arrays.stream(textWithoutPunctuation.split("\\s+")) // split sentence to words
                    .distinct() //remove duplicated words
                    .collect(Collectors.groupingBy(String::length)) // create Map <K, V>, where K is a word length and V is list of words of respective length
                    .entrySet()
                    .stream() // stream through created Map <K, V>
                    .max(Map.Entry.comparingByKey()).get(); // get maximum length and respective List of words of this length
            return new AnalyzedText(results.getKey(), results.getValue());
        }
    }
}
