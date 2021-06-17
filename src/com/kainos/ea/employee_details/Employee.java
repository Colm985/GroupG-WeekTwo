package com.kainos.ea.employee_details;

public class Employee {
    // instant variables
    private String fName;
    private String lName;
    private String address;
    private String nin;
    private int bankAccountNum;
    private int bankSortCode;
    private double startingSalary;
    private int employeeNum;
    // constructor with arguments
    public Employee(String fName, String lName, String address, String nin, int bankAccountNum, int bankSortCode, double startingSalary, int employeeNum) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.nin = nin;
        this.bankAccountNum = bankAccountNum;
        this.bankSortCode = bankSortCode;
        this.startingSalary = startingSalary;
        this.employeeNum = employeeNum;
    }
    // default constructor
    public Employee() {
    }
    // getters and setters
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNin() {
        return nin;
    }
    public void setNin(String nin) {
        this.nin = nin;
    }
    public int getBankAccountNum() {
        return bankAccountNum;
    }
    public void setBankAccountNum(int bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }
    public int getBankSortCode() {
        return bankSortCode;
    }
    public void setBankSortCode(int bankSortCode) {
        this.bankSortCode = bankSortCode;
    }
    public double getStartingSalary() {
        return startingSalary;
    }
    public void setStartingSalary(double startingSalary) {
        this.startingSalary = startingSalary;
    }
    public int getEmployeeNum() {
        return employeeNum;
    }
    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }
    // to string method
    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", nin='" + nin + '\'' +
                ", bankAccountNum=" + bankAccountNum +
                ", bankSortCode=" + bankSortCode +
                ", startingSalary=" + startingSalary +
                ", employeeNum=" + employeeNum +
                '}';
    }
}