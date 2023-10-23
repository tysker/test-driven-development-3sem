package dk.lyngby.kata4;

import java.util.Arrays;
import java.util.List;

public class Search {

    private final List<String> cities =
            Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valencia", "Vancouver", "Amsterdam", "Vienna", "Sydney", "New York City", "London", "Bangkok", "Hong Kong", "Dubai", "Rome", "Istanbul");


    public String search(String input) {
        if (input.equals("*")) return convertListToString(cities);
        if (input.length() < 2) return "";
        List<String> cities = getCities(input);
        return convertListToString(cities);
    }

    private static String convertListToString(List<String> cities) {
        String result = "";
        for (int i = 0; i < cities.size(); i++) {
            result += cities.get(i);
            if (i < cities.size() - 1) result += ", ";
        }
        return result;
    }

    private List<String> getCities(String input) {
        return this.cities.stream()
                .filter(city -> city.toLowerCase().contains(input.toLowerCase())).toList();
    }


}
