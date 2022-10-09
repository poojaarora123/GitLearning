import java.util.Scanner;
public class JC_Chapter1_PS {

    public static void main(String[] args) {
        //Question 1
     /*  int a=12;
        int b=14;
        int c = 47;
        int sum = a+b+c;
        System.out.println(sum);*/

        //---------------------------------
       //Question 2 CGPA of marks obtained in 3 subject
/*

        float sub1 = 64;
        float sub2 = 67;
        float sub3 = 78;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println(cgpa);
*/
        //----------------------------------
//    Question 3 ask user to input name and then print this text - hello! have a good day!
       /* System.out.println("What is your name?");
        Scanner sc = new Scanner (System.in);
        String name =  sc.next();
        System.out.println("Hello! " +name + " have a good day!");
*/
//-----------------------------------------------
        //Question 4  Convert Kilometers to miles
/*

        double distance = 25;
                double miles = 0.62;
                double total = distance*miles;
        System.out.println(total);
*/
//-------------------------------

        //Question 5 Detect whether the number entered by the user is an integer or not

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());



    }
}
