package Modul0_6.Modul0;

public class User {

    private String name;
    private String sex;

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }
}

class Application2 {
    public static void main(String[] args) {
        User geralt = new User("geralt", "male");
        System.out.println(geralt);

        String name = geralt.getName();
        String sex = geralt.getSex();

        System.out.println(name + " " + sex);

    }
}