package autonoma.biblioteca.models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan José Bergaño Arboleda
 * @author Carlos Andrés Rojas Parra
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
    /**
     * Lugar de residencia del autor
     */
    private String direccion;
    
    ///////////////////////////////////////////////////////////////
    /// Método constructor

    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correoElectronico, String direccion) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
        this.direccion = direccion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
   
    
    
}
