package autonoma.biblioteca.models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan José Bergaño Arboleda
 */

///////////////////////////////////////////////////////////////
    /// Atributos 
public class Autor extends Persona {
    
    /**
     * Editorial
     */
    private String editorial;
    /**
     * Profesión
     */
    private String profesion;
    
    ///////////////////////////////////////////////////////////////
    /// Método constructor

    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correoElectronico) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }

   
    
    
}
