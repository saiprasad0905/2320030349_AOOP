package payment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PayrollSystem {

    private Map<Integer, Employee> employeeMap; // Maps employee ID to Employee object
    private Set<Employee> employees;            // Holds unique Employee objects

    public PayrollSystem() {
        this.employeeMap = new HashMap<>();
        this.employees = new HashSet<>();
    }

    // Add a new employee
    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
            employeeMap.put(employee.getId(), employee);
            System.out.println("Added: " + employee);
        } else {
            System.out.println("Employee with ID " + employee.getId() + " already exists.");
        }
    }

    // Remove an employee by ID
    public void removeEmployee(int id) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            employees.remove(employee);
            employeeMap.remove(id);
            System.out.println("Removed: " + employee);
        } else {
            System.out.println("Employee with ID " + id + " does not exist.");
        }
    }

    // Update employee salary
    public void updateSalary(int id, double newSalary) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            employee.setSalary(newSalary);
            System.out.println("Updated salary for " + employee.getName() + " to " + newSalary);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Display payroll information
    public void displayPayroll() {
        System.out.println("Payroll Information:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
