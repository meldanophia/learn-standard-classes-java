package learn.standard.classes.java;

public class StringApp {
    public static void main(String[] args) {
        String name = "Melda Nophia";

        String nameToLowerCase = name.toLowerCase();
        String nameToUpperCase = name.toUpperCase();

        System.out.println(name); //Melda Nophia
        System.out.println(nameToLowerCase); //melda nophia
        System.out.println(nameToUpperCase);//MELDA NOPHIA
        System.out.println(name.length());//12
        System.out.println(name.startsWith("Melda"));//true
        System.out.println(name.endsWith("Nophia"));//true

        String[] names = name.split(" ");
        for (var value: names){
            System.out.println(value);
            // Melda
            // Nophia
        }

        System.out.println(" ".isBlank()); //true
        System.out.println(" ".isEmpty()); //false

        System.out.println(name.charAt(0)); //M

        char[] chars = name.toCharArray();
    }
}
