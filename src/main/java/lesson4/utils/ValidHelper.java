package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHelper {
    private static final String REAL = "It is real %s%s%n";
    private static final String WRONG = "It is wrong %s%s%n";

    public static void phoneValidator(String phoneNumber) {
        Pattern pattern = Pattern.compile("^\\+[3][8]\\(?[0]\\d{2}\\)?\\-?\\s?\\d{3}\\-?\\s?\\d{2}\\-?\\s?\\d{2}");
        Matcher input = pattern.matcher(phoneNumber);
        boolean matches = input.matches();
        if (matches)
            System.out.printf(REAL, "ukrainian phone number: ", phoneNumber);
        else
            System.out.printf(WRONG, "ukrainian phone number: ", phoneNumber);
    }

    public static void mailValidator(String email) {
        Pattern pattern = Pattern.compile("^\\w+\\@\\D+\\.([m][a][i][l]|[u][a])$");
        Matcher input = pattern.matcher(email);
        boolean matches = input.matches();
        if (matches)
            System.out.printf(REAL, "email: ", email);
        else
            System.out.printf(WRONG, "email: ", email);
    }

    public static void dateOfBirthValidator(String birthDate) {
        Pattern pattern = Pattern.compile("^((([0][1-9])|([1|2][0-9])|([3][0-1]))(\\.|\\-)(([0][1-9])|" +
                "([1][1-2]))(\\.|\\-)(([1][9][3-9][0-9])|([2][0][0|1][0-9]|([2][0][2][0]))))$|(" +
                "((([0][1-9])|([1|2][0-9])|([3][0-1]))(\\.|\\-)([0][1]))|" +
                "((([0][1-9])|([1][0-6])(\\.|\\-)([0][2]))" +
                "(\\.|\\-)([2][0][2][1])))$");
        Matcher input = pattern.matcher(birthDate);
        boolean matches = input.matches();
        if (matches)
            System.out.printf(REAL, "format of birth date: ", birthDate);
        else
            System.out.printf(WRONG, "format of birth date: ", birthDate);
    }
}