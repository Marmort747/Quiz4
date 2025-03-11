package solidDIP;

import solidSRP.Employee;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new SalaryCalculator();
        EmployeeService employeeService = new EmployeeService(calculator);
        employeeService.getEmployeeSalary();

    }
}
