package solidSRP;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setSalary(5000);
        employee.setName("John Doe");

        double salary = employee.getSalary();
        String name = employee.getName();

        Calculate calculate = new Calculate();
        SaveEmployee saveEmployee = new SaveEmployee();
        saveEmployee.saveEmployeeToFile(name);

        System.out.println(calculate.calculateSalary(salary));






    }
}
