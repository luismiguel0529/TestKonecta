package co.com.konecta.techincaltest.service;

import co.com.konecta.techincaltest.model.Empleado;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {

    public List<Empleado> findAll();

    public Optional<Empleado> findById(Long id);

    public Empleado save(Empleado empleado);

    public Empleado editar(Long id,Empleado empleado);


}
