package utils;

import exceptions.StringFormatException;

public class StringHelper {
    public static String stringOperator(String firstString, char[] characters) throws StringFormatException {
        if (characters == null || characters.length == 0) {
            throw new NullPointerException();
        }
        String secondString = String.valueOf(characters);
        if (firstString == null || firstString.trim().isEmpty() || secondString == null
                || secondString.trim().isEmpty()) {
            throw new StringFormatException();
        }
        String result = firstString.trim().toUpperCase() + " " + secondString.trim().toLowerCase();
        String center;
        if (result.length() % 2 == 0) {
            center = result.substring((result.length() / 2) - 1, (result.length() / 2) + 1);
        } else {
            center = result.substring(result.length() / 2, result.length() / 2 + 1);
        }
        return center;
    }
}