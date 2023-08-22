import Emp.Employee;
public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp = new Employee("Raj Singh",24,"Software Designer",85000.00f);
        System.out.println("The Details of Employee are :-");
        System.out.println("Name : "+emp.Name);
        System.out.println("Age : "+emp.Age);
        System.out.println("Designation : "+emp.Designation);
        System.out.println("Salary : "+emp.Salary);

    }
}
