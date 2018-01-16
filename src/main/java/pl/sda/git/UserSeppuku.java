package pl.sda.git;

import java.io.File;
import java.util.Scanner;


public class UserSeppuku {

    private String name;
    private int age;
    private String filename = null;


    public UserSeppuku(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void deleteUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię i nazwisko w celu przeniesienia do archiwum: ");
        filename = scanner.next();
        File file = new File("tutaj wpisac sciezke do folderu z plikami userów" + filename + ".ini");
        file.renameTo(new File("tutaj wpisac sciezke do folderu z archiwum" + filename + ".ini"));
    }
}
