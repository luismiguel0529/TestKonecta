package co.com.konecta.techincaltest.controller;


import co.com.konecta.techincaltest.model.Empleado;
import co.com.konecta.techincaltest.service.IEmpleadoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {


    @Autowired
    IEmpleadoService iEmpleadoService;

    @Operation(summary = "Operación para buscar todos los empleados")
    @GetMapping("/listar")
    public ResponseEntity<List<Empleado>> listareEmpleados(){
        return ResponseEntity
                .ok()
                .body(iEmpleadoService
                        .findAll()
                        .stream()
                        .collect(Collectors.toList()));
    }

    @Operation(summary = "Operación para buscar un empleado")
    @GetMapping("/listar/{id}")
    public ResponseEntity<Empleado> buscarEmpleado(@PathVariable Long id){
        return ResponseEntity
                .ok()
                .body(iEmpleadoService.findById(id));
    }
    @Operation(summary = "Operación para guaradar un empleado")
    @PostMapping("/guardar")
    public ResponseEntity<Empleado> guardarEmpleado(@RequestBody Empleado empleado){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(iEmpleadoService.save(empleado));
    }




}
