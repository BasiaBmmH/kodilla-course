package Modul0_6.User1;

class User {

    private String imie;
    private String nazwisko;
    private String plec;
    private String mail;
    private int wiek;

    public User(String imie, String nazwisko, String plec, int wiek, String mail) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.plec=plec;
        this.wiek=wiek;
        this.mail=mail;
    }


    public void logIn() {

    }

    public void logOut() {

    }

    public void deliteAccount() {

    }

    public String getImie() {
        return this.imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public String getPlec() {
        return this.plec;
    }

    public String getMail() {
        return this.mail;
    }

    public int getWiek() {
        return this.wiek;
    }


}

class ForumUser extends User {

    private String nazwaUzytkownika;
    private int iloscPostow;
    boolean czyZalogowany;

   // ForumUser user1 = new ForumUser();

    public ForumUser(String imie, String nazwisko, String plec, String mail, int wiek) {
        super(imie, nazwisko, plec, wiek, mail);
    }

    public void opublikujPost() {

    }

    public void dodajKomentarz() {

    }

    public void przedstaw(String imie, int wiek, int iloscPostow) {
        boolean czyZalogowany = this.czyZalogowany;
        String a;
        if (!this.czyZalogowany) {
            a = "nie";
        } else {
            a = "";
        }
        System.out.println("Użytkownik: " + imie + ", lat: " + wiek + ", ilosc postow: " + iloscPostow + ", " + a + " jest zalogowany");
    }

}

public class Application{
    public static void main(String[] args) {

        ForumUser user1 = new ForumUser("Chriss", "For", "male", "chriss@for.com", 20);
        user1.przedstaw("Chriss",20,7);

    }

}
