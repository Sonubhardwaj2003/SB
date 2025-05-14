import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.*;

@SuppressWarnings("unused")
public class _11properties {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();

        p.setProperty("Name", "Sonu");
        p.setProperty("Course", "Btech CSE");
        p.setProperty("College", "ABESEC");
        p.setProperty("State", "Haryana");

        System.out.println(p);
        p.forEach((K,V)->System.out.println(K+"->"+V));

        p.store(new FileOutputStream("/Users/sb943/OneDrive/Documents/Properties.txt"),"Laptop" );

        p.storeToXML(new FileOutputStream("/Users/sb943/OneDrive/Documents/Properties.xml"),"Laptop" );

        // this method is used to print from the textFile already in our files
        p.load(new FileInputStream("/Users/sb943/OneDrive/Documents/Properties.txt") );
        System.out.println(p);


        // this method is used to print from the xmlFile already in our files
        p.loadFromXML(new FileInputStream("/Users/sb943/OneDrive/Documents/Properties.xml") );
        System.out.println(p);

        System.out.println(p.getProperty("Name"));

    }
}
