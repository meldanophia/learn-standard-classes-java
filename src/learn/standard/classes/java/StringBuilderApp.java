package learn.standard.classes.java;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Melda");
        builder.append(" ");
        builder.append("Nophia");

        String name = builder.toString();

        System.out.println(name);
    }
}
