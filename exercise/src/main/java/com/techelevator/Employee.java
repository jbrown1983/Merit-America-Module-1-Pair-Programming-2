package com.techelevator;

public class Employee {

    private int employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;

   public static final double DEFAULT_SALARY = 60000;


    public Employee(int employeeID, String firstName, String lastName, String email, Department department, String hireDate) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
   }
   public Employee() {

    }



    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

public String getFullName(){
    return lastName + ", " + firstName;
    }

//public double raiseSalary(double percent){
//    double raise = salary * (percent / 100);
//    salary = salary + raise;
//    double newSalary = salary;
//    return newSalary;
//
//}
    public String toString() {
        return getFullName() + " (" + getSalary() + ") " + getDepartment();
    }
}


