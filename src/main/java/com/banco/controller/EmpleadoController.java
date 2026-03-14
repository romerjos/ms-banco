package com.banco.controller;

import com.banco.model.Empleado;
import com.banco.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping("/empleado")
    public Empleado registrarEmpleado(@RequestBody Empleado empleado){
        return empleadoService.registrarEmpleado(empleado);
    }

    @GetMapping("/empleados")
    public List<Empleado> listarEmpleados(){
        return empleadoService.listarEmpleados();
    }

    @GetMapping("/empleado/{dni}")
    public Empleado buscarEmpleado(@PathVariable String dni){
        return empleadoService.buscarEmpleado(dni);
    }

    @DeleteMapping("/empleado/{dni}")
    public String eliminarEmpleado(@PathVariable String dni){
        empleadoService.eliminarEmpleado(dni);
        return "Empleado eliminado correctamente";
    }
}