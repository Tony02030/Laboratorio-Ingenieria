package org.example.domain;

public class StringOperations {

    public static int countSpecialCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
