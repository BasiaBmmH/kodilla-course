package Modul0_6.Modul3.Zad2.przyklad;

import java.util.*;
import java.lang.*;
import java.time.*;

public class Book {

    String title;
    String author;
    int year;

    // constructor with arguments
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // toString method used for printout the object
    @Override
    public String toString() {
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    // getters
    public String  getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Order {

    Book book;
    LocalDate dateOfOrder;

    // constructor with arguments
    public Order(Book book, int year, int month, int day) {
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    // method used to printout the order
    @Override
    public String toString() {
        return "Order created: " + dateOfOrder + "\n" +
                " ordered book: " + book;

    }

    //getters
    public Book getBook() {
        return book;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class OrdersQueueExample {

    public static void main (String[] args) throws java.lang.Exception {
        // Create 3 sample books
        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray – lexicon for graphicians", "Dante Alighieri", 1572);

        // Create 5 sample orders
        Order theOrder1 = new Order(theBook1, 2017, 6, 28);
        Order theOrder2 = new Order(theBook2, 2017, 6, 28);
        Order theOrder3 = new Order(theBook1, 2017, 6, 29);
        Order theOrder4 = new Order(theBook2, 2017, 6, 30);
        Order theOrder5 = new Order(theBook3, 2017, 6, 30);

        // Create the FIFO queue
        Deque<Order> theOrders = new ArrayDeque<>();                // [1]

        // Check size of the queue
        System.out.println("Queue is created. It's size: " + theOrders.size());

        // Put the orders into the queue
        theOrders.offer(theOrder1);
        theOrders.offer(theOrder2);
        theOrders.offer(theOrder3);
        theOrders.offer(theOrder4);
        theOrders.offer(theOrder5);

        // Check size of the queue
        System.out.println("Queue is filled. It's size: " + theOrders.size());
        System.out.println();

        // Examine the order at beginning of the queue
        System.out.println("First order in the queue is: \n" + theOrders.peek());
        System.out.println();

        // Get objects from queue
        Order temporaryOrder;
        temporaryOrder = theOrders.poll();

        // here you can do something with order taken from the queue
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();

        // Check size of the queue
        System.out.println("Queue is emptied. It's size: " + theOrders.size());
        System.out.println();

        // Check what was taken as last
        System.out.println("Last order taken from queue was:\n" + temporaryOrder);
        System.out.println();
    }
}