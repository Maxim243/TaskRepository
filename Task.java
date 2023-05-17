package org.exampl;

public class Task {
    public static boolean verifyText(String word, String text) {
        int count = 0;
        char[] wordChars = word.toCharArray();
        char[] textChars = text.toCharArray();

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

    public static void main(String[] args) {
        System.out.println(Task.verifyText("gnavaislang", "Java - is a programming language"));

    }
}
