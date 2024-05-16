package model;

import main.Logable;
import javax.swing.JTextField;

public class Employee extends Person implements Logable {
    
    private int employeeId;
    private String password;
    private static final int USER = 123;
    private static final String PASSWORD = "test";

    public Employee(int employeeId, String password) {
        super("Default Name");
        this.employeeId = employeeId;
        this.password = password;
    }

    @Override
    public boolean login(int employeeId, String password) {
    return employeeId == USER && password.equals(PASSWORD);
    }

   
}