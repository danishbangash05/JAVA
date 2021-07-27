public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo object = new MethodDemo(); // Created an object of a class
        object.add(10, 5);
        object.subtract(10, 5);
        object.multiply(10, 5);
        object.divide(10, 5);
        /** we can use these if we have our method static i.e public static void
//        add();
//        subtract();
//        multiply();
//        divide();
         **/
    }
    public void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    public  void subtract(int a, int b){
        int c = a - b;
        System.out.println(c);
    }
    public  void multiply(int a, int b){
        int c = a * b;
        System.out.println(c);
    }
    public  void divide(int a, int b){
        int c = a/b;
        System.out.println(c);
    }
}
