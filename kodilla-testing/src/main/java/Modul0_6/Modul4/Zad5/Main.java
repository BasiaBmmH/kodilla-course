package Modul0_6.Modul4.Zad5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Clock> clocks = new LinkedList<>(
                Arrays.asList(
                        new Clock(12, 22),
                        new Clock(1, 31),
                        new Clock(7, 20),
                        new Clock(18, 50),
                        new Clock(16, 15),
                        new Clock(24, 59),
                        new Clock(17, 59)
                )
        );

        for (Clock value : clocks) {
            Clock clock = Clock.changeTime(value);
            System.out.println(clock.getHour() + ":" + clock.getMinute());
        }
    }
}

class Clock {
    private final int hour;
    private final int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public static Clock changeTime(Clock clock) {
        int h = clock.getHour();
        int min = clock.getMinute();

        if (h > 23 || h < 0 || min > 59 || min < 0) {
            return new Clock(0, 0);
        }

        if (min == 59 && h != 23) {
            h++;
            min = 0;
        } else if (h == 23 && min == 59) {
            h = 1;
            min = 0;
        } else {
            min++;
        }
        return new Clock(h, min);
    }

}
