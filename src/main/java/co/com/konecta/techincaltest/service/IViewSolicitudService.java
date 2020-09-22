package co.com.konecta.techincaltest.service;

import co.com.konecta.techincaltest.model.Solicitud;
import co.com.konecta.techincaltest.model.ViewSolicitud;

import java.util.List;

public interface IViewSolicitudService {

    public List<ViewSolicitud> findAllView();
}
