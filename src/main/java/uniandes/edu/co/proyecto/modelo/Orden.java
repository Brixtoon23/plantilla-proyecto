package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="ordenes")
public abstract class Orden 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idOrden;

    private String estado;
    private Integer precio;
    private String fechaEntrega;

    public Orden(String estado, Integer precio, String fechaEntrega) 
    {
        this.estado = estado;
        this.precio = precio;
        this.fechaEntrega = fechaEntrega;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public String getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    
}
