package com.banco.service;

import com.banco.model.Empleado;
import com.banco.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado registrarEmpleado(Empleado empleado) {
        return empleadoRepository.guardarEmpleado(empleado);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.listarEmpleados();
    }

    @Override
    public Empleado buscarEmpleado(String dni) {
        return empleadoRepository.buscarEmpleadoPorDni(dni);
    }

    @Override
    public void eliminarEmpleado(String dni) {
        empleadoRepository.eliminarEmpleado(dni);
    }
}