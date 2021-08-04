public class Calc {
    public static void main(String[] args) {
         Calc Add = new Calc();
         Add.addition(1,2,3,"Danish"); //arguments of the method
    }
    public void addition(int num1, int num2, int num3, String name){ //Parameters of Method
        int answer=num1+num2+num3;
        System.out.println("The sum of numbers given by "+name+" is " +answer);
    }
}

