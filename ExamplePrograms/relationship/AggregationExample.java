package relationship;

import java.util.ArrayList;
import java.util.List;


/*
 * 
 * Example provided by chatGPT
 * 
 * */


//Employee class
class Employee {
 private int id;
 private String name;

 Employee(int id, String name) {
     this.id = id;
     this.name = name;
 }

 @Override
 public String toString() {
     return "Employee [ID: " + id + ", Name: " + name + "]";
 }
}

//Department class
class Department {
 private String name;
 private List<Employee> employees; // Aggregation relationship

 Department(String name) {
     this.name = name;
     this.employees = new ArrayList<>();
 }

 void addEmployee(Employee employee) {
     employees.add(employee);
 }

 void displayEmployees() {
     System.out.println("Department: " + name);
     for (Employee employee : employees) {
         System.out.println(employee);
     }
 }
}

//Test class
public class AggregationExample {
 public static void main(String[] args) {
     // Employees can exist independently of the department
     Employee emp1 = new Employee(101, "Alice");
     Employee emp2 = new Employee(102, "Bob");

     // Department contains employees
     Department dept = new Department("Human Resources");
     dept.addEmployee(emp1);
     dept.addEmployee(emp2);

     // Display department employees
     dept.displayEmployees();
 }
}

