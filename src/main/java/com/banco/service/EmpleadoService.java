package com.banco.service;

import com.banco.model.Empleado;
import java.util.List;

public interface EmpleadoService {

    Empleado registrarEmpleado(Empleado empleado);

    List<Empleado> listarEmpleados();

    Empleado buscarEmpleado(String dni);

    void eliminarEmpleado(String dni);

}