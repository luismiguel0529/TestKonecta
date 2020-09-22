package co.com.konecta.techincaltest.service;

import co.com.konecta.techincaltest.exception.ApiRequestException;
import co.com.konecta.techincaltest.model.Solicitud;

import java.util.List;

public interface ISolicitudService {

    public List<Solicitud> findAll();

    public Solicitud findById(Long id);

    public Solicitud save(Solicitud solicitud) throws ApiRequestException;

    public Solicitud editar(Long id,Solicitud solicitud);

}
