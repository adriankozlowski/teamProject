package pl.sda.git;

import java.util.Random;

public  class Person {
    private int losIdent;
    private String imie;
    private String nazwisko;
    private int rokUrodz;
    private String miastoZamieszkania;
    private String ulica;
    private int kodPocztowy;

    private String stanowisko;

    public Person(String imie, String nazwisko, int rokUrodz, String miastoZamiesz, String ulica, int kodPocztowy, String stanowisko) {
        Random random = new Random();
        this.losIdent = random.nextInt(100);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodz = rokUrodz;
        this.miastoZamieszkania = miastoZamiesz;
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.stanowisko = stanowisko;
    }

    public int getLosIdent() {
        return losIdent;
    }

    public void setLosIdent(int losIdent) {
        this.losIdent = losIdent;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRokUrodz() {
        return rokUrodz;
    }

    public void setRokUrodz(int rokUrodz) {
        this.rokUrodz = rokUrodz;
    }

    public String getMiastoZamieszkania() {
        return miastoZamieszkania;
    }

    public void setMiastoZamieszkania(String miastoZamieszkania) {
        this.miastoZamieszkania = miastoZamieszkania;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(int kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
}
