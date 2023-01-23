package Modul1.Zad1;

public class Application {

    public static void main(String[] args) throws java.lang.Exception {
        // Stworzyć i wywołać klase User z konstruktorem posiadającym wszystkie atrybuty

        User newUser = new User ("Adam", 40.5, 178);

        System.out.println("program robi fruu..");



        boolean validateName = Validator.validateName(newUser.getName());

        if (validateName) {
            Validator.validateHeightAndAge(newUser.getHeight(), newUser.getAge());
        }

        System.out.println("End of the program");

    }
}

class Validator {

    public static boolean validateName(String name) {
        return name != null;
    }

    public static void validateHeightAndAge(double height, double age) {
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 and can be lower than 160cm, but also can be higher :3");
        }
    }

}

class User{
    private String name;
    private double age;
    private double height;

    public User(String name, double age, double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }


}