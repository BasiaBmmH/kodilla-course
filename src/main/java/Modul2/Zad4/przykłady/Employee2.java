package Modul2.Zad4.przykłady;

import java.util.*;
import java.lang.*;

class Employee2{
    String firstName;
    String lastName;
    String peselId;

    public Employee2(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.peselId.equals(e.peselId);
    }

    @Override
    public int hashCode() {
        //This method cuts first 6 (0-5) characters from peselId
        //and then converts it into Integer
        //peselId includes year and month and day of birth in the first 6 characters
        //for example: beginning of peselId 800630 means that persone having this peselId
        //was born on 30 June 1980.
        //returning value will be 800630 (Integer type)
        return Integer.parseInt(peselId.substring(0, 5));
    }
}

class SalaryParameters {
    Double baseSalary;
    Double regulatedBonus;
    Double chefBonus;
    Double functionAddSalary;

    public SalaryParameters(Double baseSalary, Double regulatedBonus, Double chefBonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.chefBonus = chefBonus;
        this.functionAddSalary = functionAddSalary;
    }

    @Override
    public String toString() {
        return baseSalary + " + " + regulatedBonus + " + " +
                chefBonus + " + " + functionAddSalary;
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class HashMapTest {

    public static void main (String[] args) throws java.lang.Exception {
        Employee worker1 = new Employee("Jennifer", "Nowak", "12345678901");
        Employee worker2 = new Employee("Sarah", "Taylor", "12345612345");
        Employee worker3 = new Employee("Laura", "Pinelli", "12345698765");
        Employee worker4 = new Employee("Laura", "Pinelli", "12345045678");

        SalaryParameters params1 = new SalaryParameters(5000.0, 3000.0, 0.0, 0.0);
        SalaryParameters params2 = new SalaryParameters(4000.0, 2000.0, 1000.0, 0.0);
        SalaryParameters params3 = new SalaryParameters(4500.0, 3500.0, 0.0, 0.0);
        SalaryParameters params4 = new SalaryParameters(11000.0, 0.0, 2000.0, 1000.0);

        Map<Employee, SalaryParameters> paymentParameters = new HashMap<>();

        paymentParameters.put(worker1, params1);
        paymentParameters.put(worker2, params2);
        paymentParameters.put(worker3, params3);
        paymentParameters.put(worker4, params4);

        System.out.println("Salary of Jennifer Nowak equals: " + paymentParameters.get(worker1));

    }
}
class Student {

    private int grade;


    public Student(int grade) {
        this.grade = grade;
    }

    public int setGrade(int grade) {
        return grade;
    }

    public void getGrade() {
        this.grade = grade;
    }
 //   System.out.println(object.getGrade());
}