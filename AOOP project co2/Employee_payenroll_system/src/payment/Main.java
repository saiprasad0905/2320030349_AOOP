package payment;

public class Main {

    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();

        // Add employees
        payroll.addEmployee(new Employee(1, "Sai Prasad", 5000));
        payroll.addEmployee(new Employee(2, "Sohail", 4500));
        payroll.addEmployee(new Employee(3, "Johnson", 4700));

        // Display payroll information
        payroll.displayPayroll();

        // Update salary
        payroll.updateSalary(2, 4800);

        // Display payroll after update
        payroll.displayPayroll();

        // Remove an employee
        payroll.removeEmployee(3);

        // Display payroll after removal
        payroll.displayPayroll();
    }
}

