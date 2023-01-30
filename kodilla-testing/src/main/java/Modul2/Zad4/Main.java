package Modul2.Zad4;

// Zadanie: mapa uczniów i ocen
// stwórz program z użyciem HashMap, który będzie przechowywał dane uczniów oraz ich ocen.
// Program ma wyświetlać średnią arytmetyczną ocen każdego ucznia.

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student johnDoe = new Student("John", "Doe");
        Grade mathGrade = new Grade(5, "Math");
        Grade mathGrade2 = new Grade(4, "Math");
        Grade biologyGrade = new Grade(5, "Biology");
        addGrade(mathGrade, johnDoe);
        addGrade(mathGrade2, johnDoe);
        addGrade(biologyGrade, johnDoe);
        System.out.println(johnDoe.getGrades());
        System.out.println(johnDoe.getGradeAverage("Math"));

    }

    static void addGrade(Grade grade, Student student) {
        HashMap<String, List<Integer>> grades = student.getGrades();
        List<Integer> mathGrades = grades.get(grade.course);
        if (mathGrades == null) {
            mathGrades = new ArrayList<>();
        }
        mathGrades.add(grade.value);
        grades.put(grade.course, mathGrades);
        student.setGrades(grades);
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

    double getGradeAverage(String course) {
        // TODO impelment average
        HashMap<String, List<Integer>> grades = getGrades();
        System.out.println(grades);
        List<Integer> courseGrades = grades.get(course);
        System.out.println("Course grades:" + courseGrades);
        int sum = 0;
        for (int i = 0; i < courseGrades.size(); i++) {
            sum += courseGrades.get(i);
        }

        double average = (double) sum / courseGrades.size();
        BigDecimal bigDecimal = new BigDecimal(average);
        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
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