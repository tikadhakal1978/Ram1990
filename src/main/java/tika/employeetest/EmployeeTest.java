package tika.employeetest;

public class EmployeeTest {
public static void main(String[] args) {
         employeeClass employee1 = new employeeClass ("Raj","Dhakal",5000);
         employeeClass employee2 = new employeeClass ("prisha","Dhakal",6000);
    

double yearlySalary; 
yearlySalary = employee1.getSalary()*12;
System.out.println("EMPLOYEE1 SALARY:" + yearlySalary);

yearlySalary = employee2.getSalary()*12;
System.out.println("EMPLOYEE2 SALARY:" + yearlySalary);


employee1.setSalary(employee1.getSalary()*1.1);
employee2.setSalary(employee2.getSalary()*1.1);

System.out.println("Employee 1 after 10% raise: $" + (employee1.getSalary() *12 ));
 System.out.println("Employee 2 after 10% raise: $" + (employee2.getSalary() *12 ));
        }
}

          
        
        
        


