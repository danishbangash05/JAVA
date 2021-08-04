
import java.util.Scanner;

public class SM {
    public static void main(String[] args) {
        for (int marks = 1; marks <= 20; marks++){
            int a;
            int b;
            int c;
            int d;
            int e;
            int f;

            String Name;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the Student " + marks + ": ");
            Name = sc.next();

            System.out.println("Enter number in Biology out of 100 " + marks + ": ");
            a = sc.nextInt();

            System.out.println("Enter number in Math out of 100 " + marks + ": ");
            b = sc.nextInt();

            System.out.println("Enter number in Physics out of 100 " + marks + ": ");
            c = sc.nextInt();

            System.out.println("Enter number in Chemistry out of 100 " + marks + ": ");
            d = sc.nextInt();

            System.out.println("Enter number in English out of 100 " + marks + ": ");
            e = sc.nextInt();

            System.out.println("Enter number in S.Studies out of 100 " + marks + ": ");
            f = sc.nextInt();

            System.out.println("Student = " + Name + "");
            System.out.println("Biology = " + a + "");
            System.out.println("Math = " + b + "");
            System.out.println("Physics = " + c + "");
            System.out.println("Chemistry = " + d + "");
            System.out.println("English = " + e + "");
            System.out.println("S.Studies = " + f + "");



        }
    }
}
