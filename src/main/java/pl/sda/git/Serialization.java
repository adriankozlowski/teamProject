package pl.sda.git;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeMap;

public class Serialization {
    public static void serializator(Map map,String outputFileName) throws IOException {


        ObjectOutputStream objectOutputStream = null;

        objectOutputStream = new ObjectOutputStream(new FileOutputStream(outputFileName));

        objectOutputStream.writeObject(map);
        if (objectOutputStream!=null) {
            objectOutputStream.flush();
            objectOutputStream.close();
        }
    }
}
