package com.techelevator;

import java.util.List;

public class Application {

    /**
     * The main entry point in the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private List<Department> departments;
    private List<Employee> employee;


    private void run() {
        // create some departments
        createDepartments();
        Department Marketing = new Department(001, "Marketing");
        Department Sales = new Department(002, "Sales");
        Department Engineering = new Department(003, "Engineering");

        // print each department by name
        printDepartments();
        System.out.println("Marketing");
        System.out.println("Sales");
        System.out.println("Engineering");

        // create employees
        createEmployees();
        Employee dean = new Employee(001, "Dean", "Johnson", "djohnson@teams.com", departments.get(3), "08/21/2020");
        Employee angie = new Employee(002, "Angie", "Smith", "asmith@teams.com", departments.get(3), "08/21/2020");
        Employee margaret = new Employee(003, "Margaret", "Thompson", "mthompson@teams.com", departments.get(2), "08/21/2020");


        // give Angie a 10% raise, she is doing a great job!
        angie.setSalary(angie.getSalary() / 10 + angie.getSalary());


        // print all employees
        printEmployees();
        System.out.println("Johnson" + ",Dean" + dean.getSalary(), departments.get(3));
        System.out.println("Sales");
        System.out.println("Engineering");



            /*employee.add(dean);
            employee.add(angie);
            employee.add(margaret);
            System.out.println("\n------------- EMPLOYEES ------------------------------");

            for (int i = 0; i < employee.size(); i++) {
                System.out.println(employee.get(i).getFullName() + " (" + employee.get(i).getSalary() + ") " +
                        employee.get(i).getDepartment().getName());
*/





        // create the TEams project
        createTeamsProject();

        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
