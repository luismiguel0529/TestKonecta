package co.com.konecta.techincaltest.model;

public class DTOSolicitud {

    private Long id;
    private String codigo;
    private String descripcion;
    private String resumen;
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


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DTOSolicitud id(Long id) {
        this.id = id;
        return this;
    }

    public DTOSolicitud codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public DTOSolicitud descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
    public DTOSolicitud resumen(String resumen) {
        this.resumen = resumen;
        return this;
    }

    public DTOSolicitud nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}
