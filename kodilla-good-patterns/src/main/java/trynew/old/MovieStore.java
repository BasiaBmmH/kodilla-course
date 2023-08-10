package trynew.old;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MovieStore {
    public static void main(String[] args) {

        Map<String, List<String>> titlesWithTranslations = getMovies();

        String titles = titlesWithTranslations.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.joining(" ! "));

        System.out.println(titles);


        System.out.println("\nsilnia: " + silnia(3));
    }

    public static Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public static int silnia(int n) {
        int wynikSilni = 1;

        for (int i = n; i >= 1; i--) {
            wynikSilni *= i;
        }

        return wynikSilni;
    }
}