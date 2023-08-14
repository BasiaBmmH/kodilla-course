package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository //znaczy, że klasa służy do obsługi repozytorium danych
public final class LibraryDbController {

    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the database");
    }
}