import jdk.jfr.Percentage;

import java.util.Scanner;
public class JC_06_Percentage {
    public static void main(String[] args) {
        System.out.println("Finding the Percentage of Marks Obtained: ");
        Scanner sc = new Scanner (System.in);
        double total = 500;
        double outOf = 100;
        System.out.println("Enter your first Subject Marks: ");
        double sub1 = sc.nextInt();
        System.out.println("Enter your Second Subject Marks: ");
        double sub2 = sc.nextInt();
        System.out.println("Enter your Third Subject Marks: ");
        double sub3 = sc.nextInt();
        System.out.println("Enter your Fourth Subject Marks: ");
        double sub4 = sc.nextInt();
        System.out.println("Enter your Fifth Subject Marks: ");
        double sub5 = sc.nextInt();
        double sum = sub1+sub2+sub3+sub4+sub5;
        double percent = sum/total*outOf;
        System.out.println("The percentage of marks obtained is: "+ percent);

    }
}
