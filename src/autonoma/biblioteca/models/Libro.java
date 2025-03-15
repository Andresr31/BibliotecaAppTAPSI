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
    
    ///////////////////////////////////////////////////////////////
    /// Método constructor

    public Libro(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
}
