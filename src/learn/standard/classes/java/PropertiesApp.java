package learn.standard.classes.java;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        //get properties
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("database.host")); //localhost
            System.out.println(properties.getProperty("database.port")); //9999

        }catch (FileNotFoundException exception){
            System.out.println("file tidak ketemu");
        } catch (IOException exception){
            System.out.println("gagal load data dari file");
        }

        //store properties
        try{
            Properties properties = new Properties();

            properties.put("name.first", "Melda");
            properties.put("name.last", "Nophia");

            properties.store(new FileOutputStream("name.properties"), "konfigurasi nama");

        }catch(FileNotFoundException exception){
            System.out.println("file tidak ketemu");
        } catch (IOException e) {
            System.out.println("Error menyimpan properties");
        }
    }
}
