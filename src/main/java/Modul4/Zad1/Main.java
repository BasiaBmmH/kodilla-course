package Modul4.Zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for (int i = 0; i < companies.size(); i++) {
            if (i == companies.size() - 1) {
                System.out.print(companies.get(i));
            } else {
                System.out.print(companies.get(i) + ", ");
            }

        }
    }
}
