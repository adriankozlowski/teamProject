package pl.sda.git;

public class Main {
    public static void main(String[] args) {
        showmenu();
    }

    private static void showmenu() {
        System.out.println("1. Dodaj osobę");
        System.out.println("2. Pokaż listę osób");
        System.out.println("3. Eksport bazy do pliku");
        System.out.println("4. Import bazy z pliku");
        System.out.println("5. Zamknij program");
    }
}
