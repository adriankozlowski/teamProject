package pl.sda.git;

import java.util.Scanner;

public class Main {
    static PersonList personList = new PersonList();

    public static void main(String[] args) {
        showmenu();
    }

    private static void showmenu() {
        Scanner scanner = new Scanner(System.in);
        int menunumber = 0;
        int number = 0;
        boolean exit = false;

        while (!exit) {
            menunumber = 0;
            number = 0;

            System.out.println(++menunumber + ". Dodaj osobę");
            System.out.println(++menunumber + ". Pokaż listę osób");
            System.out.println(++menunumber + ". Eksport bazy do pliku");
            System.out.println(++menunumber + ". Import bazy z pliku");
            System.out.println(++menunumber + ". Sortowanie po kluczu");
            System.out.println(++menunumber + ". Zamknij program");
            try {
                while (number > menunumber || number < 1) {
                    System.out.println("Wpisz twój wybór: ");
                    number = scanner.nextInt();
                }
            } catch (Exception e) {
                scanner.nextLine();
            }

            switch (number) {
                case 1: {
                    //Wywołanie dodania osoby
                    personList.addPerson();
                    break;
                }
                case 2: {
                    personList.showList();

                    //Wywołanie  pokazania listy osób
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
                    //Wywołanie sortowania

                    break;
                }


                case 6: {
                    //Koniec programu
                    exit = true;
                    break;
                }

                default: {
                    break;
                }
            }
        }
        System.out.println("Koniec programu!");
    }

}

