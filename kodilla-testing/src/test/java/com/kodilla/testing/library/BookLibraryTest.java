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


    //TODO
    // gdy użytkownik nie ma wypożyczonych żadnych książek,
    // gdy ma wypożyczoną jedną książkę,

    @Test
    void listBooksInHandsOfWhenUserHas5Books() {
        //given
        LibraryUser libraryUser = new LibraryUser("John", "Doe", "123123123");
        List<Book> fiveBooks = IntStream.range(0,5).boxed().map(el -> new Book(""+el, ""+el, el)).toList();
        Mockito.when(libraryDatabase.listBooksInHandsOf(libraryUser)).thenReturn(fiveBooks);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);


        //when
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        Assertions.assertEquals(5, userBooks.size());
        Assertions.assertEquals(fiveBooks, userBooks);
    }
}