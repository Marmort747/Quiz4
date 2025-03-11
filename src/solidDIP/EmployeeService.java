package solidDIP;


public class EmployeeService {

    private Calculator calculator;

    public EmployeeService(Calculator calculator) {
        this.calculator = calculator;
    }

    public void getEmployeeSalary() {
         calculator.getSalary();
    }
}
