package Modul1.Zad4;

public class Main {

    public static void main(String[] args) {

        Bankomat runner = new Bankomat();
        runner.run();

    }

}

abstract class Bank {

    abstract protected void insertTheCard();

    abstract protected void enterPinNumber();

    abstract protected void enterTheAmount();

    private void commandAccepted() {
        System.out.println("We took the command: processing .. ");
    }

    private void checkingTheAccountBalance() {
        System.out.println("Checking funds, please wait: * loading ... * ");
    }

    private void possibilityOfPayment() {
        System.out.println("Transaction possible, going to realization ...");
    }

    abstract protected void cashWithdrawal();

    abstract protected void thanks();

    public void run() {
        this.insertTheCard();
        this.enterPinNumber();
        this.enterTheAmount();
        this.commandAccepted();
        this.checkingTheAccountBalance();
        this.possibilityOfPayment();
        this.cashWithdrawal();
        this.thanks();
    }

}

class Bankomat extends Bank {

    protected void insertTheCard() {
        System.out.println("Please insert your card");
    }

    protected void enterPinNumber() {
        System.out.println("Please enter your pin:");
    }

    protected void enterTheAmount() {
        System.out.println("Amount to be paid: ");
    }

    protected void cashWithdrawal() {
        System.out.println("Withdrawing ...");
    }

    protected void thanks() {
        System.out.println("Thank you for using our services! ");
        System.out.println("See ya again^^");
    }

}