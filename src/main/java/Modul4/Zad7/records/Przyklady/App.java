import Modul4.Zad7.records.Przyklady.BookRecord;

public class App {
    public static void main(String[] args) {
        BookRecord book = new BookRecord("John Novak", "Algorithms and other nightmares", 2018);
        int year = book.year();
        System.out.println(book);
    }
}