import java.sql.SQLOutput;
import java.util.Scanner;
public class JC_Chapter3_Strings {
    public static void main(String[] args) {
        // String name = new String ("Pooja");
        String name = "PoojaArora";
        System.out.println(name);
        //Return length of String
        int value = name.length();
        System.out.println(value);
        //Return Lowercase
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        //Return Uppercase
        String upstring = name.toUpperCase();
        System.out.println(upstring);
        // Trimming the String
        String nonTrimmedSTring = "     Pooja    ";
        System.out.println(nonTrimmedSTring);
        String trimmedString = nonTrimmedSTring.trim();
        System.out.println(trimmedString);
    }
}

