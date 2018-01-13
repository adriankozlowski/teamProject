package pl.sda.git;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showmenu();
    }

    private static void showmenu() {
        Scanner scanner = new Scanner(System.in);
        int number=0;

        System.out.println("1. Dodaj osobę");
        System.out.println("2. Pokaż listę osób");
        System.out.println("3. Eksport bazy do pliku");
        System.out.println("4. Import bazy z pliku");
        System.out.println("5. Zamknij program");
        try {
            while(number>5 || number<1)
            number = scanner.nextInt();
        }
        catch (Exception e){
            showmenu();
        }

        switch (number){
            case 1: {
                //Wywołanie dodania osoby
                break;
            }
            case 2: {
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
                //Koniec programu
                System.out.println("Program się zamyka!");
                break;
            }
            default:
                showmenu();
                break;
        }

    }
}
