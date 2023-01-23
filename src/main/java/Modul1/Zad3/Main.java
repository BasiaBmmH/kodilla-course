package Modul1.Zad3;

interface Quest {
    String process();

    String questName();
}

class DeadIslandQuest implements Quest {

    @Override
    public String process() {
        return "New quest: Dead Island ~ *dark music playing*";
    }

    public String questName() {
        return "Dead Island Quest";
    }

}

class EliteKnightQuest implements Quest {

    public String questName() {
        return "Elite Knight Quest";
    }

    @Override
    public String process() {
        return "New quest: Elite Knight ~ *fight music playing*";
    }
}

interface Fighter {
    String runQuest();

    String getNameOfFinishedQuest();
}

class Knight implements Fighter {
    private final String name;
    private final Quest quest;


    public Knight(String name, Quest quest) {
        this.name = name;
        this.quest = quest;
        System.out.println(runQuest());
    }

    @Override
    public String runQuest() {
        return name + " u've started a " + quest.process();
    }

    @Override
    public String getNameOfFinishedQuest() {
        return "Finished quest: " + quest.questName();
    }
}

public class Main {
    public static void main(String[] args) {

        Fighter newKnight = new Knight("Fenrir", new DeadIslandQuest());
        System.out.println(newKnight.getNameOfFinishedQuest());
        System.out.println();

        Fighter newKnight1 = new Knight("Ragnar", new EliteKnightQuest());
        System.out.println(newKnight1.getNameOfFinishedQuest());

    }
}
