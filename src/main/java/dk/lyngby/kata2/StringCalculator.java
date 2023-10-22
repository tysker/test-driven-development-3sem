package dk.lyngby.kata2;

public class StringCalculator {

    public int add(String s) {
        if(s.isEmpty()) return 0;

        if(s.contains(",")){
            String[] numbers = s.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }

        return Integer.parseInt(s);
    }
}
