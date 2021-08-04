/**import java.util.*; //using libraries
public class Employee
{
    public static void main(String args[])
    {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        employee1.employee_details();
        employee2.employee_details();
    }
    public void employee_details()
    {
        String name;
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Name of employee is " + name);
        System.out.println("Id of employee is " + id);

    }
}
*/

public class Employee{
    public Employee(){
        System.out.println("I am simple constructor");
    }
    public Employee(String name, int id){
        System.out.println("I have 2 parameters");
        System.out.println("name: " + name);
        System.out.println("id: " + id);
    }
    public Employee(String name, int id, String address)
    {
        System.out.println("I have 3 parameters");
    }
    public static void main(String [] args){
        Employee employee1=new Employee();
        Employee employee2=new Employee("Kanta",1);
        Employee employee3=new Employee("Khairul",2,"abc street");

    }
}