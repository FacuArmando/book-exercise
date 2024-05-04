/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    /**
     * Muestra el nombre del Autor del Libro
     */
    public String getAutor(String bookAuthor){
        return bookAuthor;
    }
    
    /**
     * Muestra el titulo del Libro
     */
    public String getTitle(String bookTitle){
        return bookTitle;
    }
    
    /**
     * Muestra la cantidad de paginas del Libro
     */
    public int getPages(int bookPages){
        return bookPages;
    }
    
    /**
     * Método que retorna (consulta) la cantidad de veces en las que se a prestado un libro
     */
    public int getBorrowed(){
       return borrowed;
    }
}
