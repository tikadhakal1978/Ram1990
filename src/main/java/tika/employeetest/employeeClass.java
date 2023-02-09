/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/**
 *
 * @author tikad
 */
package tika.employeetest;
public class employeeClass {
  
    
    
    
    
// instance variables
  private String fname;
  private String lname;
  private double salary;

 public employeeClass (String fname , String lname, double salary)  {
  
  this.fname = fname;
  this.lname = lname;
  if (salary >0){
     this.salary = salary;
 }
 }
  
 public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlname() {
        return lname;
    }

    public void setFiname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >0){
        this.salary = salary;
    }
  
    }
    
    
    
   
}
