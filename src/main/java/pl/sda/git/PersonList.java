package pl.sda.git;

import pl.sda.git.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonList {

    private List<Person> list = new ArrayList<Person>();

    public void showList() {

        for (Person person : list) {

            System.out.println(person.getImie());
            System.out.print(" " + person.getNazwisko());
            System.out.print(" " + person.getMiastoZamiesz());
            System.out.println();

        }
    }

    public void addPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj rok urodzenia");
        String rok = scanner.nextLine();
        System.out.println("Podaj miasto: ");
        String miasto = scanner.nextLine();
        System.out.println("Podaj ulice: ");
        String ulica  =scanner.nextLine();
        System.out.println("Podaj kod pocztowy: ");
        String kod = scanner.nextLine();
        System.out.println("Podaj stanowisko: ");
        String stanowisko = scanner.nextLine();

        list.add(new Person(imie, nazwisko, Integer.valueOf(rok), miasto, ulica,Integer.valueOf(kod), stanowisko));

        System.out.println("Osoba dodana");
    }
}
