/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flash
 */
import java.util.ArrayList;
public class Usuario {
    private String nombre;
    private ArrayList<Creaciones> creaciones = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Creaciones> getCreaciones() {
        return creaciones;
    }
    
    public String getNombreCreacion(int num) {
        return creaciones.get(num).getNombre();
    }
}
