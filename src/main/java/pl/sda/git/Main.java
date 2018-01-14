package pl.sda.git;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showmenu();
    }

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
                Scanner scan = new Scanner(System.in);
                BufferedReader inputStream = null;
                System.out.println("Podaj ścieżę");
                String pat = scan.nextLine();
                Path path = Paths.get(pat);

                try {
                    inputStream = new BufferedReader(new FileReader(pat));
                } catch (FileNotFoundException e) {
                    System.out.println("Taki plik nie istnieje");
                    break;
                }

                //WYSWIETLANIE DANYCH
                try (BufferedReader br = new BufferedReader(new FileReader(pat))) {

                    String line;

                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                }
                catch (IOException e) {
                    System.out.println("Koniec pliku");

                }

                //WYCZYSZCZENIE BUFORA
                finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                break;
            }
                case 5: {
                //Wywołanie sortowania

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
