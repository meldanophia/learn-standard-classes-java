package learn.standard.classes.java;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Melda Nophia";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        //what is the difference between split and tokenizer?
        //tokenizer is a lazy split
        //tokenizer = "splitted" where the next token is to be processes

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
            //Melda
            //Nophia
        }

    }
}
