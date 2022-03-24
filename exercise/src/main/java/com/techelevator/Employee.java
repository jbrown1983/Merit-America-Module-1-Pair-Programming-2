package com.techelevator;

public class Employee {

    private long employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;

    public static final double DEFAULT_SALARY = 60000;


    public Employee(long employeeID, String firstName, String lastName, String email, final double DEFAULT_SALARY, Department department, String hireDate) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = DEFAULT_SALARY;
    }
    public Employee() {

    }

    public Employee(int i, String angie, String smith, String s, Department department, String s1) {
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
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

public double raiseSalary(double percent){
    double raise = salary * (percent / 100);
    salary = salary + raise;
    double newSalary = salary;
    return newSalary;

}


}
