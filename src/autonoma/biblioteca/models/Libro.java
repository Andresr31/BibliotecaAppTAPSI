/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * @author Juan José Bergaño Arboleda
 */

///////////////////////////////////////////////////////////////
    /// Atributos 
public class Libro {
    /**
     * Id del libro
     */
    private Long id;
    /**
     * Titulo del libro
     */
    private String titulo;
    /**
     * Autor
     */
    
    private Autor autor;
    
    ///////////////////////////////////////////////////////////////
    /// Método constructor

    public Libro(Long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    
}
