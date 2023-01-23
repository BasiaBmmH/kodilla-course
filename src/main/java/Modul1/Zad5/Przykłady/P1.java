package Modul1.Zad5.Przykłady;

public class P1 {
}
interface Employee {

    double calculateSalary();
}

class FixedSalaryEmployee implements Employee {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}

class HourlySalaryEmployee implements Employee {

    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }
}

// Payout
abstract class SalaryPayout {                      // [1]

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();               // [2]

    public void processPayout() {                   // [3]
        //Implementation
    }
}

class SalaryPayoutProcessor extends SalaryPayout { // [4]

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        //Implementation
    }
}
