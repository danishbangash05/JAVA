//created  by danish on july 23rd, 2021

public class HelloWorld {
    int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int x = 8;
        int y = 9;

        int total = x - 3;

        HelloWorld obj = new HelloWorld();
        int result = obj.addition(total,y);
        System.out.println("the result is " + result);

    }
}
