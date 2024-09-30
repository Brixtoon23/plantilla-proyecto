package uniandes.edu.co.proyecto.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proovedores")
public abstract class Proovedor 
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer nit;

    private String nombre;
    private String direccion;
    private String personaContacto;
    private String telefonoPersonaContacto;

    public Proovedor(String nombre, String direccion, String personaContacto,
            String telefonoPersonaContacto) 
        {
        this.nombre = nombre;
        this.direccion = direccion;
        this.personaContacto = personaContacto;
        this.telefonoPersonaContacto = telefonoPersonaContacto;
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

    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    public String getTelefonoPersonaContacto() {
        return telefonoPersonaContacto;
    }

    public void setTelefonoPersonaContacto(String telefonoPersonaContacto) {
        this.telefonoPersonaContacto = telefonoPersonaContacto;
    }
      

}
