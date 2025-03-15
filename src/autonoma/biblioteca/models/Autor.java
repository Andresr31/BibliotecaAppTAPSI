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
    
    private string paisOrigen;
    
    ///////////////////////////////////////////////////////////////
    /// Método constructor

    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correoElectronico, String paisOrigen) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
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

    public string getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(string paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

   
    
    
}
