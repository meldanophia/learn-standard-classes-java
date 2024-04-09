package learn.standard.classes.java;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");

        joiner.add("Melda");
        joiner.add("Nophia");

        String value = joiner.toString();

        System.out.println(value); // [Melda,Nophia]

    }
}
