package com.banco.service;

import com.banco.model.Empleado;
import com.banco.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public Empleado registrarEmpleado(Empleado empleado){
        return empleadoRepository.guardarEmpleado(empleado);
    }
}