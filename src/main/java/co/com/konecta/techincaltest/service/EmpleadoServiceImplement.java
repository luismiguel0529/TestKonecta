package co.com.konecta.techincaltest.service;

import co.com.konecta.techincaltest.model.Empleado;
import co.com.konecta.techincaltest.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImplement implements IEmpleadoService {


    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado findById(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado editar(Long id, Empleado empleado) {
     return null;
    }
}
