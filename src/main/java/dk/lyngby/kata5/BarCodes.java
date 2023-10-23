package dk.lyngby.kata5;

public class BarCodes {

    private double price = 0;
    public String scanProduct(int code) {
        if(code == 12345) {
            price += 7.25;
            return "$7.25";
        }
        if(code == 23456) {
            price += 12.50;
            return "$12.50";
        }
        return "Invalid bar-code";
    }

    public String getTotal() {
        return "$" + price;
    }

}
