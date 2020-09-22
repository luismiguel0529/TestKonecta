package co.com.konecta.techincaltest.model;

import io.swagger.v3.oas.annotations.Hidden;

import javax.persistence.*;
import java.io.Serializable;



//@Subselect(value = "SELECT s.id,s.codigo,s.descripcion,s.resumen,s.id_empleado,e.nombre FROM solicitud s LEFT JOIN empleados e ON s.id_empleado = e.id")
@Entity
@Table(name = "SOLICITUD")
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 4002221912401133094L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CODIGO")
    private String codigo;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "RESUMEN")
    private String resumen;

//    @ManyToOne(optional = false)
//    @JoinColumn(name = "ID_EMPLEADO")
    @Column(name = "ID_EMPLEADO")
    private Long idempleado;


    @Hidden
    @Transient
    @Column(name = "NOMBRE",insertable = false)
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Long getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Long idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
