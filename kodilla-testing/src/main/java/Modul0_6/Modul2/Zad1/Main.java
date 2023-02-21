package Modul0_6.Modul2.Zad1;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[]{ 3,2,3,3,5,6,3,3,9,3,1,2,3,1,3,3,7,3,19,3 };
        double counter = 0;


        for (int i = 0; i < tab.length; i++) {
//            tab[i] = i;
//            System.out.print(tab[i] + " ");
            counter = counter + tab[i];
        }
        System.out.println();
        System.out.println( "srednia: " + counter + "/" + tab.length + " = " + counter / tab.length);
    }
}