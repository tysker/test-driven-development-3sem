package dk.lyngby.kata7;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Greeting {


    public String greet(String... names) {
        StringBuilder greeting = new StringBuilder("Hello, ");

        if (names == null) {
            return greeting + "my friend.";
        }

        if (arrayOfNamesContainsComma(names)) {
            List<String> namesWithComma = new ArrayList<>();
            for (String name : names) {
                if (name.contains(",")) {
                    String[] split = name.split(", ");
                    Collections.addAll(namesWithComma, split);
                } else {
                    greeting.append(name).append(", ");
                }
            }

            for (int i = 0; i < namesWithComma.size(); i++) {
                if(i == namesWithComma.size() - 1) {
                    greeting.append("and ").append(namesWithComma.get(i)).append(".");
                } else {
                    greeting.append(namesWithComma.get(i)).append(", ");
                }
            }
            return greeting.toString();
        }

        if (names.length == 2) {
            return namesArrayEqualToTwo(names, greeting.toString());
        }

        if (names.length > 2) {
            return namesArrayLongerThanTwo(names, greeting.toString());
        }

        if (names[0].equals(names[0].toUpperCase())) {
            return greeting.toString().toUpperCase() + names[0] + "!";
        }
        return greeting + names[0] + ".";
    }


    private static boolean arrayOfNamesContainsComma(String[] names) {
        for (String name : names) {
            if (name.contains(",")) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    private static String namesArrayEqualToTwo(String[] names, String greeting) {
        return greeting + names[0] + " and " + names[1] + ".";
    }

    @NotNull
    private static String namesArrayLongerThanTwo(String[] names, String greeting) {
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder().append(" AND HELLO ");
        List<String> upper = new ArrayList<>();
        List<String> lower = new ArrayList<>();

        for (String name : names) {
            boolean isUpperCase = name.equals(name.toUpperCase());
            if (isUpperCase) {
                upper.add(name);
            } else {
                lower.add(name);
            }
        }

        for (int i = 0; i < lower.size(); i++) {
            if (i == lower.size() - 1) {
                lowerCase.append("and ").append(lower.get(i)).append(".");
            } else if (i == lower.size() - 2 && !upper.isEmpty()) {
                lowerCase.append(lower.get(i)).append(" ");
            } else {
                lowerCase.append(lower.get(i)).append(", ");
            }
        }

        for (int i = 0; i < upper.size(); i++) {
            if (i == upper.size() - 1) {
                upperCase.append(upper.get(i)).append("!");
            } else if (i == upper.size() - 2) {
                upperCase.append(upper.get(i)).append(" AND ");
            } else {
                upperCase.append(upper.get(i)).append(", ");
            }
        }

        if (upper.isEmpty()) {
            return greeting + lowerCase;
        }

        return greeting + lowerCase + upperCase;

    }
}
