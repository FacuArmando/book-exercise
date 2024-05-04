import java.util.ArrayList;
/**
 * Catalogo es una colección que mantiene una lista de libros, permite añadir y
 * eliminar libros al catálogo, así como imprimir el listado de libros que contiene.
 * 
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Catalogo{
    //Campos de la clase
    private ArrayList<Book> libreria;

    /**
     * Constructor de objetos de la clase Catalogo
     */
    public Catalogo(){
        libreria = new ArrayList<>();
    }
    
    /**
     * El método (comando) agregarLibro permite añadir otro libro al catalogo.
     * Precondiciones: (Para la clase Book) Los libros no deben repetirse o ser null
     */
    public void agregarLibro(Book unLibro){
        libreria.add(unLibro);
    }
    
    /**
     * El método (comando) removerLibro permite eliminar un libro del catalogo.
     * Precondiciones: (Para la clase Book) implementar el equals
     */
    public void removerLibro(Book unLibro){
        int index = 0;
        boolean found = false;
        while(!found && index < libreria.size()){
           //implementar equals en la clase Libro
           //Si el libro de ese indice es igual al libro guardado en el catalogo
           //entonces se eliminar y found para a ser verdadero
           if(libreria.get(index).equals(unLibro)){
               libreria.remove(index);
               found = true;
           }
           index ++; //index = index + 1;
        }
        if(!found){
            System.out.println("Libro no encontrado");
        }else{
            System.out.println("El libro fue eliminado correctamente.");
        }
    }
    
    /**
     * El método (consulta) mostrarLibros permite visualizar todos los libros que posee la colección
     * catálogo.
     * Precondicion: (Para la clase Book) evitar que los libros ingresados sean vacíos y implementar
     * toString en la clase Book:
     * public String toString(){
     *   return "Nombre: " + title + "\nAutor: " + author + "\n";
     * }
     */
    public void mostrarLibros(){
        for(Book unLibro : libreria){
            System.out.println(unLibro.toString());
        }
    }
}