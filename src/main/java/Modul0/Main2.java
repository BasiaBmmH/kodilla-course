package Modul0;

public class Main2 {

    public static void main(String[] args) {

        Player player1 = new Player("Chriss", 7);

        String name = player1.getName();
        int points = player1.getPoints();

        System.out.println(name + " " + points);
    }
}


class Player {
    private String name;
    private int points;

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

}