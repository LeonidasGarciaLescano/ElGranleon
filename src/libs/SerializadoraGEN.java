package libs;

import general.ContenerIdentificadores;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modeloArea.ArregloArea;

public class SerializadoraGEN {

    public static void serializarIdentificadores(ContenerIdentificadores contId) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Identificadores"));
            escritor.writeObject(contId);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ContenerIdentificadores deserializarIdentificadores() {
        ContenerIdentificadores contId;
        try {
            ObjectInputStream lector
                    = new ObjectInputStream(
                            new FileInputStream("Identificadores"));
            contId = (ContenerIdentificadores) lector.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return contId;

    }

    public static void serializarAreas(ArregloArea areas) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Areas"));
            escritor.writeObject(areas);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArregloArea deserializarArregloArea() {
        ArregloArea areas;
        try {
            ObjectInputStream lector
                    = new ObjectInputStream(
                            new FileInputStream("Areas"));
            areas = (ArregloArea) lector.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return areas;

    }

}
