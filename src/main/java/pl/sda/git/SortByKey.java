package pl.sda.git;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortByKey {

    public static void sort(List<Person> list){

        System.out.println("Podaj klucz po których chcesz sortować: ");
        System.out.println("1 - Imie ");
        System.out.println("2 - Nazwisko ");
        System.out.println("3 - Stanowisko ");
        System.out.println("4 - Miasto urodzenia ");
        System.out.println("5 - Ulica ");
        System.out.println("6 - Rok urodzenia ");
        System.out.println("Każda inna wartość - Sortowanie po ID ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1){
            sort2(list,SortByKeyEnum.IMIE);
        } else if (number == 2){
            sort2(list,SortByKeyEnum.NAZWISKO);
        } else if (number == 3){
            sort2(list,SortByKeyEnum.STANOWISKO);
        } else if (number == 4){
            sort2(list,SortByKeyEnum.MIASTOURODZENIA);
        } else if (number == 5){
            sort2(list, SortByKeyEnum.ULICA);
        } else if (number == 6){
            sort2(list, SortByKeyEnum.ROKURODZENIA);
        } else {
            sort2(list, SortByKeyEnum.ID);
        }

        for (Person g:list){
            System.out.println(g.toString());
        }
    }

    private static void sort2(List<Person> list, final SortByKeyEnum key) {

        Collections.sort(list, new Comparator<Person>() {

            public int compare(Person o1, Person o2) {
                switch (key) {
                    case IMIE:
                        return o1.getImie().compareTo(o2.getImie());
                    case NAZWISKO:
                        return o1.getNazwisko().compareTo(o2.getNazwisko());
                    case STANOWISKO:
                        return o1.getStanowisko().compareTo(o2.getStanowisko());
                    case MIASTOURODZENIA:
                        return o1.getMiastoZamieszkania().compareTo(o2.getMiastoZamieszkania());
                    case ULICA:
                        return o1.getUlica().compareTo(o2.getUlica());
                    case ROKURODZENIA:
                        return Double.compare(o1.getRokUrodz(), o2.getRokUrodz());
                    default: //Domyślne sortowanie po ID
                        return Double.compare(o1.getLosIdent(), o2.getLosIdent());
                }
            }
        });
    }
}
