package learn.standard.classes.java;

import java.math.BigInteger;

public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1000000000000000000000");

        BigInteger b = new BigInteger("2000000000000000000000");

        BigInteger c = a.add(b);
        System.out.println(c);

    }
}
