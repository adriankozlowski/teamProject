package pl.sda.git;

import pl.sda.git.Person;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Podaj imie");
        //dodaje perosny do listy
    }
}
