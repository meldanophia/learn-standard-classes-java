package learn.standard.classes.java;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        //convertion number class
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10000";

        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);
    }
}
