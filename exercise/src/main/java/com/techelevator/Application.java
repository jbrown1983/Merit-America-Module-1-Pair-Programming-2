package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;


public class Application extends Employee {
    public static List<Department> departments = new ArrayList<>();
    public static List<Employee> employees = new ArrayList<>();
    public static Map<String, Project> project = new TreeMap<>();
    public static List<Employee> deptMarketing = new ArrayList<>();
    public static List<Employee> deptSales = new ArrayList<>();
    public static List<Employee> deptEngineering = new ArrayList<>();
    public static Map<String, Project> projects = new HashMap();


    /**
     * The main entry point in the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    //private List<Department> departments;
    //private List<Employee> employee;


    private void run() {
        // create some departments
        createDepartments();
        Department Marketing = new Department(001, "Marketing");
        Department Sales = new Department(002, "Sales");
        Department Engineering = new Department(003, "Engineering");

        departments.add(Marketing);
        departments.add(Sales);
        departments.add(Engineering);

        // print each department by name
        printDepartments();

        System.out.println("Marketing\nSales\nEngineering");

        // System.out.println("Sales");
        // System.out.println("Engineering");

        // create employees
        createEmployees();
        employees = new ArrayList<>();
        Employee dean = new Employee();
        Employee angie = new Employee();
        Employee margaret = new Employee();

        dean.setEmployeeID(1);
        dean.setFirstName("Dean");
        dean.setLastName("Johnson");
        dean.setEmail("djonhson@teams.com");
        dean.setSalary(DEFAULT_SALARY);
        dean.setDepartment(departments.get(3));
        dean.setHireDate("08/21/2020");
        employees.add(dean);
        employees.add(new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(3), "08/21/2020"));
        employees.add(new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", departments.get(2), "08/21/2020"));


        // give Angie a 10% raise, she is doing a great job!
        angie.setSalary(angie.getSalary() / 10 + angie.getSalary());


        // print all employees
        printEmployees();
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getFullName() + " (" + employees.get(i).getSalary() + ") " +
                    employees.get(i).getDepartment().getName());

        }

        //System.out.println("Johnson" + ",Dean" + dean.getSalary(), departments.get(3));
        //System.out.println("Sales");
        //System.out.println("Engineering");


        // create the TEams project
        createTeamsProject();
        Project TEams = new Project("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Engineering")) {
                deptEngineering.add(employee);
            }
        }
        TEams.setTeamMembers(deptEngineering);
        projects.put(TEams.getName(), TEams);
    }

        //create the 'Marketing Landing Page' project.
        createLandingPageProject() {
            Project Marketing = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing",
                "10/10/2020", "10/17/2020");

        for (Employee employee : employees ) {
            if (employee.getDepartment().getName().equals("Marketing")) {
                deptMarketing.add(employee);
            }
        }
        Marketing.setTeamMembers(deptMarketing);

        projects.put(Marketing.getName(), Marketing);
    }

    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        System.out.println("TEams: " + deptEngineering.size());

        System.out.println("Marketing Landing Page: " + deptMarketing.size());
/* print number of employees on the project
Teams: 2
Marketing Landing Page: 1
*/
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
