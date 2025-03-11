package solidDIP;


import solidSRP.Employee;

public class SalaryCalculator implements Calculator {

    @Override
    public void getSalary() {
        System.out.println(calculateSalary());
    }

    public double calculateSalary() {
        return 1000.0;
    }


}
