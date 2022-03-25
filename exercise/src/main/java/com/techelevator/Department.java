package com.techelevator;

public class Department {
    private int departmentID;
    private String name;

    public Department(int departmentID, String name) {
        this.departmentID = departmentID;
        this.name = name;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return getName();
    }
}

