package learn.standard.classes.java;

public class RuntimeApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors()); //8
        System.out.println(runtime.freeMemory()); //260296368
        System.out.println(runtime.totalMemory()); //264241152
        System.out.println(runtime.maxMemory()); //4213178368
    }
}
