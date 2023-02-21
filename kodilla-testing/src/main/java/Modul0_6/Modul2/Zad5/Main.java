package Modul0_6.Modul2.Zad5;

// Zadanie: mapa uczniów i ocen
// Przy użyciu wewnętrznego edytora Kodilli stwórz program z użyciem HashMap,
// który będzie przechowywał dane uczniów oraz ich ocen.
// Program ma wyświetlać średnią arytmetyczną ocen każdego ucznia.

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student johnDoe = new Student("John", "Doe");
        Grade mathGrade = new Grade(5, "Math");
        Grade mathGrade2 = new Grade(3, "Math");
        Grade biologyGrade = new Grade(5, "Biology");
        addGrade(mathGrade, johnDoe);
        addGrade(mathGrade2, johnDoe);
        addGrade(biologyGrade, johnDoe);
        System.out.println(johnDoe.getGrades());

    }

    static void addGrade(Grade grade, Student student) {
//        HashMap<String, List<Integer>> grades = student.getGrades();
//        List<Integer> mathGrades = grades.get(grade.course);
//        if (mathGrades == null) {
//            mathGrades = new ArrayList<>();
//        }
//        mathGrades.add(grade.value);
//        grades.put(grade.course, mathGrades);
//        student.setGrades(grades);
    }

}

class Student {
    String firstName;
    String lastName;
    HashMap<String, List<Integer>> grades = new HashMap<>();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public HashMap<String, List<Integer>> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<String, List<Integer>> grades) {
        this.grades = grades;
    }

    public void getGrades(HashMap<String, List<Integer>> grades) {
        this.grades = grades;
    }

    int getGradeAverage(String grade) {
        // TODO impelment average

        getGrades(grades);

        return 0;
    }
}

class Grade {
    int value;
    String course;

    public Grade(int value, String course) {
        this.value = value;
        this.course = course;
    }

}