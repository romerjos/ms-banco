package com.banco.controller;

import com.banco.model.Empleado;
import com.banco.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping("/empleado")
    public Empleado registrarEmpleado(@RequestBody Empleado empleado){
        return empleadoService.registrarEmpleado(empleado);
    }


}