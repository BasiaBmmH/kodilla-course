package Modul2.Zad3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Integer> grades1 = Arrays.asList(3, 3, 4, 4, 4, 5, 5, 5, 6);
        List<Integer> grades2 = Arrays.asList(4, 4, 4, 4, 2, 3, 4);

        System.out.println("Grades1: " + countAverage(grades1));
        System.out.println("Grades2: " + countAverage(grades2));
        System.out.println();

        List<Book> booksList = new LinkedList<>();

        Book book1 = new Book("Sherlock Holems", 1892);
        booksList.add(book1);
        Book book2 = new Book("Under the Dome", 2009);
        booksList.add(book2);
        Book book3 = new Book("DOGS", 2001);
        booksList.add(book3);
        Book book4 = new Book("Akatsuki no Yona", 2009);
        booksList.add(book4);
        Book book5 = new Book("Vinland Saga", 2005);
        booksList.add(book5);
        Book book6 = new Book("Norsk Lyrikk", 1950);
        booksList.add(book6);
        Book book7 = new Book("Psycho-Pass", 2012);
        booksList.add(book7);
        Book book8 = new Book("Gangsta", 2011);
        booksList.add(book8);
        Book book9 = new Book("Noragami", 2010);
        booksList.add(book9);
        Book book10 = new Book("Bungou Stray Dogs", 2012);
        booksList.add(book10);
        Book book11 = new Book("Hell's Paradise", 2018);
        booksList.add(book11);

        Book.showBookSince(booksList, 2000);

    }

    private static double countAverage(List<Integer> grades) {

        Collections.sort(grades);
        // [1,2,3,4,5,6,7]
        List<Integer> newGrades = grades.subList(1, grades.size() - 1);

        int sum = 0;
        for (Integer theGrade : newGrades) {
            sum += theGrade;
        }

        double average = ((double) sum / newGrades.size());

        BigDecimal bigDecimal = new BigDecimal(average);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}

class Book {
    String name;
    int date;

    public Book(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    static void addBookToList(List<Book> listName, Book book) {
        listName.add(book);
    }

    public static void showBookSince(List<Book> listName, int date) {
        for (Book books : listName) {
            if ((books.getDate()) >= date) {
                System.out.println(books.getName());
            }
        }
    }
}


