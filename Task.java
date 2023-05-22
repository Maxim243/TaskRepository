package org.exampl;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task {
    public static boolean verifyText(String word, String text) {
        int count = 0;
        char[] wordChars = word.toCharArray();
        char[] textChars = text.toCharArray();

        if (wordChars.length == 0 || textChars.length == 0) return false;

        for (char wordChar : wordChars) {
            for (char textChar : textChars) {
                if (wordChar == textChar) {
                    count++;
                    break;
                }
            }
        }
        return count >= wordChars.length;
    }

    public static boolean verifyTextWithMap(String word, String text) {

        char[] charsText = text.toCharArray();
        char[] charsWord = word.toCharArray();
        String[] stringArrayText = new String[charsText.length];
        String[] stringArrayWord = new String[charsWord.length];
        int count = 0;

        for (int i = 0; i < charsText.length; i++) {
            stringArrayText[i] = String.valueOf(charsText[i]);
        }

        for (int i = 0; i < charsWord.length; i++) {
            stringArrayWord[i] = String.valueOf(charsWord[i]);
        }

        Map<String, Long> textMap = Arrays.stream(stringArrayText)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> wordMap = Arrays.stream(stringArrayWord)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<String, Long> iterateMapWord : wordMap.entrySet()) {
            if(textMap.containsKey(iterateMapWord.getKey())) count++;
        }
        return count == wordMap.size();
    }

    public static void main(String[] args) {
//        System.out.println(Task.verifyText("progisava", "Java - is a programming language"));
        System.out.println(verifyTextWithMap("dansatous", "Fast and Furious "));
    }
}
