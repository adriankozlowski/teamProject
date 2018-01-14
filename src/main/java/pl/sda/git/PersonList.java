package pl.sda.git;

import pl.sda.git.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    public static void showList() {


    List<Person> list = new ArrayList<Person>();
    int i = 0;
//    for(i = 0; i<list.length; i++){
        System.out.println(list);
    }


    public void addPerson() {
        System.out.println("Podaj imie");
    }
}
