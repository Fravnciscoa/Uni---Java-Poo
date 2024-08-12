import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Estante estante = new Estante();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese opción del menú:");
        System.out.println("Opción 1: Agregar un libro");
        System.out.println("Opción 2: buscar un libro");
        System.out.println("Opción 3: eliminar un libro");
        System.out.println("Opción 4: Registrar un préstamo");
        System.out.println("Opción 5: salir");
        while (true){
            String opcion = lector.readLine();
            switch (opcion){
                case "1":
                    System.out.println("Ingrese la clave donde desea guardar el libro:");
                    String clave = lector.readLine();

                    System.out.println("Ingrese el código del libro:");
                    String codigo = lector.readLine();

                    System.out.println("Ingrese el título del libro:");
                    String titulo = lector.readLine();

                    System.out.println("Ingrese el autor del libro:");
                    String autor = lector.readLine();

                    System.out.println("Ingrese el número de veces prestado:");
                    int vecesPrestado = Integer.parseInt(lector.readLine());

                    Libro nuevoLibro = new Libro(codigo, titulo, autor, vecesPrestado);
                    estante.agregarLibro(clave, nuevoLibro);
                    break;

                case "2":
                    System.out.println("Ingrese código de su libro:");
                    String codigoLibro = lector.readLine();
                    estante.mostrarLibro(codigoLibro);

//                case "3":
//                    estante.eliminarLibro();
//                case "4":
//                    estante.registrarPrestamo();
//                case "5":
//                    return;
                default: {
                    System.out.println("opción invalida bye");
                    break;
                }
            }
        }
    }
}
