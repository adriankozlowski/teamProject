package pl.sda.git;

import java.text.DateFormat;

public class Document {

    Person kupujacy;
    Person sprzedajacy;
    String przedmiot;
    int cena;
    DateFormat data;


    public Document(Person kupujacy, Person sprzedajacy, String przedmiot, int cena, DateFormat data) {
        this.kupujacy = kupujacy;
        this.sprzedajacy = sprzedajacy;
        this.przedmiot = przedmiot;
        this.cena = cena;
        this.data = data;
    }

    public Person getKupujacy() {
        return kupujacy;
    }

    public void setKupujacy(Person kupujacy) {
        this.kupujacy = kupujacy;
    }

    public Person getSprzedajacy() {
        return sprzedajacy;
    }

    public void setSprzedajacy(Person sprzedajacy) {
        this.sprzedajacy = sprzedajacy;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public DateFormat getData() {
        return data;
    }

    public void setData(DateFormat data) {
        this.data = data;
    }
}
