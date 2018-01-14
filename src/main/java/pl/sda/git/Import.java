package pl.sda.git;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Import {

    public static void importFiles() {


        Scanner scan = new Scanner(System.in);
        BufferedReader inputStream = null;
        System.out.println("Podaj ścieżę");
        String pat = scan.nextLine();
        Path path = Paths.get(pat);

        try {
            inputStream = new BufferedReader(new FileReader(pat));

                //WYSWIETLANIE DANYCH
                try (BufferedReader br = new BufferedReader(new FileReader(pat))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

                } catch (IOException e) {
                System.out.println("Koniec pliku");
                }


        } catch (FileNotFoundException e)


        {
            System.out.println("Taki plik nie istnieje");
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
    }
}