package arrayer.code;

import arrayer.ui.UIFrame;

import javax.swing.*;
import java.util.Arrays;
import java.util.function.Predicate;


public class StreamPartOne {



    public static void ArrayPartOne(String[] partOneArray, UIFrame uiFrame){

        long longWordCount = Arrays.stream(partOneArray)
                .filter(word -> word.length() > 8).count();

        long uniqueWordCount = Arrays.stream(partOneArray)
                .distinct().count();

        long shortWordCount = Arrays.stream(partOneArray)
                .filter(word -> word.length() < 4).count();

        Double averageWordLength = Arrays.stream(partOneArray)
                .mapToDouble(String::length).average().orElse(0);

        Integer totalCharacterCount = Arrays.stream(partOneArray)
                .mapToInt(String::length).sum();

        Predicate<String> shortPredicate = word -> word.length() < 12;
        boolean allWordShortTwelve = Arrays.stream(partOneArray)
                .allMatch(shortPredicate);

        Predicate<String> longPredicate = word -> word.length() > 2;
        boolean allWordLongTwo = Arrays.stream(partOneArray)
                .allMatch(longPredicate);



        uiFrame.labelResults.AddResults(longWordCount, uniqueWordCount, shortWordCount, averageWordLength,totalCharacterCount,allWordShortTwelve,allWordLongTwo);



    }

}
