package co.com.konecta.techincaltest.service;

import co.com.konecta.techincaltest.exception.ApiRequestException;
import co.com.konecta.techincaltest.model.Solicitud;
import co.com.konecta.techincaltest.repository.EmpleadoRepository;
import co.com.konecta.techincaltest.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SolicitudServiceImplement implements ISolicitudService {


    @Autowired
    SolicitudRepository solicitudRepository;

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public List<Solicitud> findAll() {
        return solicitudRepository.findAll();
    }

    @Override
    public Solicitud findById(Long id) {
        return solicitudRepository.findById(id).orElse(null);
    }

    @Override
    public Solicitud save(Solicitud solicitud) throws ApiRequestException {


        if (empleadoRepository.findById(solicitud.getIdempleado()).isEmpty()){
            throw new ApiRequestException("El Empleado para asignar una solicitud no existe");
        }
        return solicitudRepository.save(solicitud);
    }

    @Override
    public Solicitud editar(Long id, Solicitud solicitud) {
      return null;
    }

}
