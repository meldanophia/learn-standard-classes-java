package learn.standard.classes.java;

import java.util.UUID;

public class UuidApp {
    public static void main(String[] args) {
        for (var i = 0 ; i < 100 ; i ++){
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }
    }
}
