package learn.standard.classes.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Melda Nophia";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*"); //regex search huruf "a" for each kata

        Matcher matcher = pattern.matcher(name);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
