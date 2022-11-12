package utilities;

import jdk.nashorn.internal.ir.ReturnNode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1- Properties objesi oluşturacağız

    static Properties properties;

    //2- bu class ın amacı configuration.properties dosyasını okumaktır.
    //ayrıca oradaki key value ikililerini istediğimiz key e  ait value yi bize getirmektir.

    static {
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fileInputStream);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //3- test class ından configReader class ına ulaşmaktır. (KÖPRÜ vazifesi görmektir)

        public static String getProperty(String key){

            String value=properties.getProperty(key);
            return value;
        }





}
