package co.com.konecta.techincaltest.controller;


import co.com.konecta.techincaltest.exception.ApiRequestException;
import co.com.konecta.techincaltest.model.DTOSolicitud;
import co.com.konecta.techincaltest.model.Solicitud;
import co.com.konecta.techincaltest.service.ISolicitudService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {


    @Autowired
    ISolicitudService iSolicitudService;

    @Operation(summary = "Operación para buscar todos las solicitudes")
    @GetMapping("/listar")
    public ResponseEntity<List<DTOSolicitud>> listarSolicitud(){
        return ResponseEntity
                .ok()
                .body(iSolicitudService
                        .findAll()
                        .stream()
                        .map(solicitud -> new DTOSolicitud()
                                .id(solicitud.getId())
                                .codigo(solicitud.getCodigo())
                                .descripcion(solicitud.getDescripcion())
                                .resumen(solicitud.getResumen())
                                .nombre(solicitud.getNombre()))
                        .collect(Collectors.toList()));
    }

    @Operation(summary = "Operación para buscar una solicitud")
    @GetMapping("/listar/{id}")
    public ResponseEntity<Solicitud> buscarSolicitud(@PathVariable Long id){
        return ResponseEntity
                .ok()
                .body(iSolicitudService.findById(id));
    }
    @Operation(summary = "Operación para guardar una solicitud")
    @PostMapping("/guardar")
    public ResponseEntity<Solicitud> guardarSolicitud(@RequestBody Solicitud solicitud) throws ApiRequestException {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(iSolicitudService.save(solicitud));
    }



}
