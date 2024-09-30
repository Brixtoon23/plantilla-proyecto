package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sucursales")
public abstract class Sucursal 
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idSucursal;

    private String nombre;
    private String direccion;
    private String tamanio;
    private String telefono;
    public Sucursal(String nombre, String direccion, String tamanio, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tamanio = tamanio;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
