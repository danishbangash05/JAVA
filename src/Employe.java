public class Employe {
    String name;
    int id;
    public void print_info(){

        System.out.println("Name is "+name+" and id is "+id);

    }
    public static void main(String args[])
    {
        Employe emp1 = new Employe();
        Employe emp2 = new Employe();
        emp1.print_info();
        emp2.print_info();

    }
}