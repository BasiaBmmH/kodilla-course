package Modul0_6.Modul2.Zad4.Przyklady;

import java.lang.*;

class Employee {
    String firstName;
    String lastName;
    String peselId;

    public Employee(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.peselId.equals(e.peselId);
    }

}

/* Name of the class has to be "Main" only if the class is public. */
class EqualityTest {

    public static void main(String[] args) throws java.lang.Exception {
        Employee worker1 = new Employee("Zachary", "Taylor", "12345678901");
        Employee worker2 = new Employee("Elizabeth", "Kowalski", "10987654321");
        System.out.println("worker1 == worker2: " + (worker1 == worker2));

        Employee worker3 = new Employee("Monica", "Smith", "99999888887");
        Employee worker4 = new Employee("Monica", "Smith", "99999888887");
        System.out.println("worker3 == worker4: " + (worker3 == worker4));

        Employee worker5 = new Employee("Monica", "Nowak", "99999888000");
        Employee worker6 = new Employee("Monica", "Nowak", "99999888000");
        System.out.println("worker5.equals(worker6): " + (worker5.equals(worker6)));
    }
}