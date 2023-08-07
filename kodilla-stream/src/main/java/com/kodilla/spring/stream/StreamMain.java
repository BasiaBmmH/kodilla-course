package com.kodilla.spring.stream;

import com.kodilla.spring.stream.forumuser.Forum;
import com.kodilla.spring.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
 /*
        System.out.println("\nWelcome to module 7 - Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        ExecutorSaySomething executorSaySomething = new ExecutorSaySomething();
        processor.execute(executorSaySomething);

        Executor codeExecute = () -> System.out.println("example of Lambda Expression");
        processor.execute(codeExecute);

        Processor processor1 = new Processor();
        processor1.execute(() -> System.out.println("przypisane wprost do argumentu metody"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("\nCalculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        // Referencję do dowolnej metody statycznej klasy uzyskujemy poprzez użycie
        // następującego zapisu:
        // ClassName::methodName


        System.out.println("\nCalculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("\nPoem Beautifier results:");
        poemBeautifier.beautify("poem", " beautifier", (text1, text2) -> text1 + "ABC" + text2.toUpperCase());
        poemBeautifier.beautify("poem", " beautifier", (text1, text2) -> "ABC" + text1 + "ABC" + text2 + " aplication");
        poemBeautifier.beautify("poem", " beautifier", (text1, text2) -> "~~ " + text1 + " ~~" + text2 + " ~~");
        poemBeautifier.beautify("Hi", " Bye", (text1, text2) -> "(～￣▽￣)～ " + text1 + " and " + text2 + " ¬_¬");
        poemBeautifier.beautify("poem", " beautifier", (text1, text2) -> "^^" + text1 + text2 + "^^");


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
        */
 /*
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        System.out.println("\ndlugosc napisu > 11");
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

 */
 /*
     BookDirectory theBookDirectory = new BookDirectory();

       Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
          .filter(book -> book.getYearOfPublication() > 2005)
          .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]

       System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
       theResultMapOfBooks.entrySet().stream()
          .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
          .forEach(System.out::println);

         */
 /*
 public static void main(String[] args) {
      BookDirectory theBookDirectory = new BookDirectory();
      String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
         .filter(book -> book.getYearOfPublication() > 2005)
         .map(Book::toString)
         .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

         System.out.println(theResultStringOfBooks);
  */

        Forum forum = new Forum();
        ForumUser firstUser = forum.getUserList().get(0);

        List<ForumUser> filteredUsers = forum.getUserList().stream()
                .filter(forumUser -> 'M' == forumUser.getSex())
                //.filter(forumUser -> LocalDate.now().getYear() - 20 >= forumUser.getBirthDay().getYear());
                .filter(forumUser -> LocalDate.now().minusYears(20).isAfter(forumUser.getBirthDay()))
                .filter(forumUser -> forumUser.getPostsCount() > 0)
                .map(user -> new ForumUser(user.getId(), user.getName(), user.getSex(), user.getBirthDay(), user.getPostsCount()))
                .toList();

        firstUser.setSex('F');
        Map<Integer, ForumUser> userMap = filteredUsers.stream()
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));


        // FIXED zamienić na wywołanie kolektora z mapą w ramach powyższego streama
//        for (ForumUser user : filteredUsers) {
//            userMap.put(user.getId(), user);
//        }
        System.out.println("User map: " + userMap.size());

        userMap.entrySet().forEach(System.out::println);


        Map<Integer, Integer> evenPostsCount = forum.getUserList()
                .stream()
                .filter(forumUser -> forumUser.getPostsCount() % 2 == 0)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser::getPostsCount));

        System.out.println(evenPostsCount);

        // FIXED stworzyć strumień sprawdzający czy liczba postów użytkownika jest parzysta i zwrócić mapę
        // takich użytkowników { klucz -> liczba postów, wartość -> lista użytkowników


/*
    // TO SAMO

//    (a, b) -> {
//        System.out.println("a" + "b");
//        return a + b;
//    }

    private double sum(int a, int b) {
        System.out.println("a" + "b");
        return a + b;

 */
    }
}

