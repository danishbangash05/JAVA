import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        for (int i =1; i <= 2; i++){

            int a;
            int b;
            String name;
            Scanner sc = new Scanner(System.in);

            System.out.println("Student Name " + i + ": ");
            name = sc.next();

            System.out.println("Marks in English " + i + ": ");
            a = sc.nextInt();

            System.out.println("Marks in Maths " + i + ": ");
            b = sc.nextInt();

            System.out.println("Student = " + name + "");
            System.out.println("English = " + a + "");
            System.out.println("Maths = " + b + "");

        }
    }
}
