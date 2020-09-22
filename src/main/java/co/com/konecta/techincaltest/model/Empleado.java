package co.com.konecta.techincaltest.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EMPLEADOS")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 5002221912401133094L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FECHA_INGRESO")
    private Date fechaIngreso;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "SALARIO")
    private Long salario;

//    @OneToMany(mappedBy = "idempleado")
//    private List<Solicitud> solicitudes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

//    public List<Solicitud> getSolicitudes() {
//        return solicitudes;
//    }
//
//    public void setSolicitudes(List<Solicitud> solicitudes) {
//        this.solicitudes = solicitudes;
//    }
}
