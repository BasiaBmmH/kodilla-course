package Modul1.Zad5;

//pracownika zarabiającego 5 zł za stworzenie jednego produktu,
//pracownika, który zarabia pensję podstawową 2000 zł i 20% tej pensji, jeżeli zrealizuje dodatkową sprzedaż dowolnego produktu.

interface Employee {

    double calculateSalary();

}

public class Application {

    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000.0);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        processor.processPayout();

        SalaryByCountEmployee employee1 = new SalaryByCountEmployee(20_000, 5);

        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(employee1);
        processor1.processPayout();

        FixedSalaryWithBonusEmployee employee2 = new FixedSalaryWithBonusEmployee(20);

        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(employee2);
        processor2.processPayout();

    }
}
class SalaryByCountEmployee implements Employee{

    private int productAmount;
    private double productValue;

    public SalaryByCountEmployee(int productAmount, double productValue) {
        this.productAmount = productAmount;
        this.productValue = productValue;
    }

    @Override
    public double calculateSalary() {
        return productAmount*productValue;
    }

}

class FixedSalaryWithBonusEmployee implements Employee{

    private double salary=2000;
    private double bonusPercent;

    public FixedSalaryWithBonusEmployee(double bonusPercent) {
        this.bonusPercent=bonusPercent;

    }

    @Override
    public double calculateSalary() {
        return salary + salary*(bonusPercent/100);
    }
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
abstract class SalaryPayout {

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }

}

class SalaryPayoutProcessor extends SalaryPayout {

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        System.out.println("Sending money to employee");
    }

}