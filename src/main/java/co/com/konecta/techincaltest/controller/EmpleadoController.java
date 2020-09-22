package co.com.konecta.techincaltest.controller;


import co.com.konecta.techincaltest.model.Empleado;
import co.com.konecta.techincaltest.service.IEmpleadoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {


    @Autowired
    IEmpleadoService iEmpleadoService;

    @Operation(summary = "Operación para buscar todos los empleados")
    @GetMapping("/listar")
    public String listareEmpleados(Model model){
        List<Empleado> empleados = iEmpleadoService
                        .findAll()
                        .stream()
                        .collect(Collectors.toList());

        model.addAttribute("empleados",empleados);
        return "empleados";
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
    public String guardarEmpleado(@Valid Empleado empleado, Model model){
        Empleado empleadoG = iEmpleadoService.save(empleado);

        model.addAttribute("empleado",empleadoG);
        return "redirect:/empleado/listar";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model){
        model.addAttribute("empleado",new Empleado());
        return "formempleado";
    }




}
