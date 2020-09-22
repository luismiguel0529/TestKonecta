package co.com.konecta.techincaltest.controller;


import co.com.konecta.techincaltest.exception.ApiRequestException;
import co.com.konecta.techincaltest.model.DTOSolicitud;
import co.com.konecta.techincaltest.model.Solicitud;
import co.com.konecta.techincaltest.model.ViewSolicitud;
import co.com.konecta.techincaltest.service.ISolicitudService;
import co.com.konecta.techincaltest.service.IViewSolicitudService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/solicitud")
public class SolicitudController {


    @Autowired
    ISolicitudService iSolicitudService;

    @Autowired
    IViewSolicitudService iViewSolicitudService;

    @Operation(summary = "Operación para buscar todos las solicitudes")
    @GetMapping("/listar")
    public String listarSolicitud(Model model){
        List<DTOSolicitud> solicitudes = iViewSolicitudService
                        .findAll()
                        .stream()
                        .map(solicitud -> new DTOSolicitud()
                                .id(solicitud.getId())
                                .codigo(solicitud.getCodigo())
                                .descripcion(solicitud.getDescripcion())
                                .resumen(solicitud.getResumen())
                                .nombre(solicitud.getNombre()))
                        .collect(Collectors.toList());
        model.addAttribute("solicitudes",solicitudes);
        return "solicitudes";
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
    public String guardarSolicitud(@Valid Solicitud solicitud,Model model) throws ApiRequestException {
        Solicitud solicitudG = iSolicitudService.save(solicitud);
        model.addAttribute("solicitud",solicitudG);
        return "redirect:/solicitud/listar";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model){
        model.addAttribute("solicitud",new Solicitud());
        return "formsolicitud";
    }




}
