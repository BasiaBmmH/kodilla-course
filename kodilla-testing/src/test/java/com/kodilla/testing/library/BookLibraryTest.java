package com.kodilla.testing.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.IntStream;

@ExtendWith(MockitoExtension.class)
class BookLibraryTest {

    @Mock
    private LibraryDatabase libraryDatabase;


    @Test
    void userHasNoBooksRented() {
        //given
        LibraryUser libraryUser = new LibraryUser("Matt", "Smyk", "1237557899");
        List<Book> zeroBooks = IntStream.range(0, 0).boxed().map(el -> new Book("" + el, "" + el, el)).toList();
        Mockito.when(libraryDatabase.listBooksInHandsOf(libraryUser)).thenReturn(zeroBooks);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);

        //when
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        Assertions.assertEquals(0, userBooks.size());
        Assertions.assertEquals(zeroBooks, userBooks);

    }

    @Test
    void userHasOneRentedBok() {
        //given
        LibraryUser libraryUser = new LibraryUser("Ann", "Joe", "780211883399");
        List<Book> oneBook = IntStream.range(0, 1).boxed().map(el -> new Book("" + el, "" + el, el)).toList();
        Mockito.when(libraryDatabase.listBooksInHandsOf(libraryUser)).thenReturn(oneBook);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);

        //when
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        Assertions.assertEquals(1, userBooks.size());
        Assertions.assertEquals(oneBook, userBooks);
    }

    @Test
    void listBooksInHandsOfWhenUserHas5Books() {
        //given
        LibraryUser libraryUser = new LibraryUser("John", "Doe", "123123123");
        List<Book> fiveBooks = IntStream.range(0, 5).boxed().map(el -> new Book("" + el, "" + el, el)).toList();
        Mockito.when(libraryDatabase.listBooksInHandsOf(libraryUser)).thenReturn(fiveBooks);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);

        //when
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        Assertions.assertEquals(5, userBooks.size());
        Assertions.assertEquals(fiveBooks, userBooks);

        //test skończony, dopisuję, żeby się pojawiło na githubie
    }
}