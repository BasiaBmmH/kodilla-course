package Modul0_6.Modul3.Zad5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> list = new LinkedList<>();
        Map<String, Book> hashMap = new HashMap<>();


        for (int i = 0; i < 1500; i++) {
            Book b = new Book("Author" + i, "Title" + i);
            list.add(b);

            hashMap.put("Author" + i, b);
        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getAuthor() + " " + list.get(i).getTitle());
//        }

//        for (Map.Entry<String, String> map : hashMap.entrySet()) {
//            System.out.println(map.getKey() + " " + map.getValue());
//        }


        Book bookList0 = new Book("Naoto", "IT");
        Book book1List = new Book("Mimi", "CS");


        //czasomierz
        long listBegin = System.nanoTime();
        list.remove(0);
        list.remove(list.size() - 1);
        list.add(0, bookList0);
        list.add(list.size() - 1, book1List);
        long listEnd = System.nanoTime();

        System.out.println("LinkedList: removeing and adding elements at the beginning and ending of the collection has taken: " + (listEnd - listBegin) + "ns");

        long mapBegin = System.nanoTime();
        hashMap.remove("Author0");
        hashMap.remove("Author" + hashMap.size());
        hashMap.put("Heine", book1List);
        hashMap.put("Badou", bookList0);
        long mapEnd = System.nanoTime();


        System.out.println("   HashMap: removeing and adding elements at the beginning and ending of the collection has taken: " + (mapEnd - mapBegin) + "ns");

//        for (Map.Entry<String, String> map : hashMap.entrySet()) {
//            System.out.println(map.getKey() + " " + map.getValue());
//        }
//        System.out.println(list.size());


    }
}

class Book {
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}
