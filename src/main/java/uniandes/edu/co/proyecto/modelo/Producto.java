package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public abstract class Producto 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProducto;

    private String codigoBarras;
    private String nombre;
    private String presentacion;
    private String cantidadPresentacion;
    private String unidadMedida;
    private Integer costoBodega;
    private Integer precioUnitarioVenta;
    private String peso;
    private String volummen;
    private String fechaExpiración;

    public Producto(String codigoBarras,String nombre, String presentacion, String cantidadPresentacion,String unidadMedida,
                    Integer costoBodega,Integer precioUnitarioVenta,String peso,String volummen,String fechaExpiración)
    {
        this.codigoBarras=codigoBarras;
        this.nombre=nombre;
        this.presentacion=presentacion;
        this.cantidadPresentacion=cantidadPresentacion;
        this.costoBodega=costoBodega;
        this.fechaExpiración=fechaExpiración;
        this.peso=peso;
        this.volummen=volummen;
        this.precioUnitarioVenta=precioUnitarioVenta;
        this.unidadMedida=unidadMedida;
    }

    public Producto()
    {;}
    
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getCantidadPresentacion() {
        return cantidadPresentacion;
    }

    public void setCantidadPresentacion(String cantidadPresentacion) {
        this.cantidadPresentacion = cantidadPresentacion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Integer getCostoBodega() {
        return costoBodega;
    }

    public void setCostoBodega(Integer costoBodega) {
        this.costoBodega = costoBodega;
    }

    public Integer getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    public void setPrecioUnitarioVenta(Integer precioUnitarioVenta) {
        this.precioUnitarioVenta = precioUnitarioVenta;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getVolummen() {
        return volummen;
    }

    public void setVolummen(String volummen) {
        this.volummen = volummen;
    }

    public String getFechaExpiración() {
        return fechaExpiración;
    }

    public void setFechaExpiración(String fechaExpiración) {
        this.fechaExpiración = fechaExpiración;
    }


}
