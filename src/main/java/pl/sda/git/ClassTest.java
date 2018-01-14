package pl.sda.git;

import java.io.IOException;
import java.util.*;

public class ClassTest {
    public static void main(String[] args) throws IOException{
        Map<String,Person> map = new HashMap<>();
        Person person1 = new Person("wojtek","ozog",1978,"kato","chrobrego",41250,"nic");
        map.put("wojtek",person1);
        Serialization.serializator(map,"nazwaPliku");
    }
}
