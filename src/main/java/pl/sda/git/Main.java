package pl.sda.git;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showmenu();
    }
    static PersonList personList = new PersonList();


    private static void showmenu() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int menunumber = 0;

        System.out.println(++menunumber + ". Dodaj osobę");
        System.out.println(++menunumber + ". Pokaż listę osób");
        System.out.println(++menunumber + ". Eksport bazy do pliku");
        System.out.println(++menunumber + ". Import bazy z pliku");
        System.out.println(++menunumber + ". Sortowanie po kluczu");
        System.out.println(++menunumber + ". Zamknij program");
        try {
            while (number > menunumber || number < 1){
                System.out.println("Wpisz twój wybór: ");
                number = scanner.nextInt();}
        } catch (Exception e) {
            Main.showmenu();
        }

        switch (number) {
            case 1: {
                //Wywołanie dodania osoby

                personList.addPerson();

                break;
            }
            case 2: {
                //Wywołanie  pokazania listy osób
                personList.showList();
                break;
            }
            case 3: {
                ////Wywołanie  eksportu do pliku
                break;
            }
            case 4: {
                //Wywołanie importu z bazy
                break;
            }


            case 5: {
                //Sortowanie listy
                SortByKey.sort(personList.getList());
                break;
            }


            case 6: {
                //Koniec programu
                System.out.println("Program się zamyka!");
                break;
            }

        default:{
        Main.showmenu();
        break;}
    }

}
}
