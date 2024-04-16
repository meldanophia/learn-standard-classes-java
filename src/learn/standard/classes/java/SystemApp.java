package learn.standard.classes.java;

public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()); //1713260714009
        System.out.println(System.nanoTime()); //702639130857100

        System.out.println(System.getenv("BCA_ACC")); //0611102380
        System.out.println(System.getenv("APP")); //ah moso

        System.gc(); //garbage collection

        System.exit(0); //exit java app

        System.out.println("Hi"); //it would never printed

    }
}
