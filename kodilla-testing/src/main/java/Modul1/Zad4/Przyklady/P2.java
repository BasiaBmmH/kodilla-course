package Modul1.Zad4.Przyklady;

public class P2 {
}
abstract class ComplicatedAlgorithm {

    abstract protected void firstMethodToExecute();
    abstract protected void secondMethodToExecute();

    private void thirdMethodToExecute() {
        System.out.println("This is third method to execute");
    }

    private void fourthMethodToExecute() {
        System.out.println("This is fourth method to execute.");
    }

    public void run() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
        this.thirdMethodToExecute();
        this.fourthMethodToExecute();
    }
}
