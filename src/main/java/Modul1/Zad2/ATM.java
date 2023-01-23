package Modul1.Zad2;

interface ATM {
    void wplata(long kwota);

    void wyplata(long kwota);

    default void connecting() {
        System.out.println();
        System.out.println("Connecting with your bank...");
        System.out.println("loading...");
        System.out.println("connected");
        System.out.println();
    }

    static void endOfTransaction() {
        System.out.println("end of transaction. Take your card and money");
        System.out.println("see ya again soon :)");
    }

}

class ATMImpl implements ATM {

    @Override
    public void wplata(long kwota) {
        System.out.println("Wplac: " + kwota);
    }

    @Override
    public void wyplata(long kwota) {
        System.out.println("Wyplac: " + kwota);
    }

}


class Application {
    public static void main(String[] args) {

        long kwota1 = 1500;
        long kwota2 = 700;
        ATMImpl newTransaction = new ATMImpl();

        newTransaction.connecting();
        newTransaction.wplata(kwota1);
        newTransaction.wyplata(kwota2);
        ATM.endOfTransaction();
    }
}



