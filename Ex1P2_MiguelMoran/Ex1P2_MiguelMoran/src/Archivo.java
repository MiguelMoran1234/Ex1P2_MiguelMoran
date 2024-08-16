/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flash
 */
public class Archivo extends Creaciones{
    private String contenido;

    public Archivo(String contenido, String nombre) {
        super(nombre);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
    
}
