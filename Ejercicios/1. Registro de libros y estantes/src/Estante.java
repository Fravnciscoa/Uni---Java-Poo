import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Estante {

    private Map<String, Libro> estantes;

    public Estante() {
        estantes = new HashMap<>();
    }

    public void agregarLibro(String key, Libro libro) {
        estantes.put(key, libro);
        System.out.println("Libro agregado en la clave: " + key);
    }

    public void mostrarLibro(String key) {
        Libro libro = estantes.get(key);
        if (libro != null) {
            System.out.println(libro);
        }
        else {
            System.out.println("Libro no encontrado");
        }
    }
}
