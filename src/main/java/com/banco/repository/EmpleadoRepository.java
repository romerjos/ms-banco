package com.banco.repository;

import com.banco.model.Empleado;
import java.util.List;

public interface EmpleadoRepository {

    Empleado guardarEmpleado(Empleado empleado);

    Empleado buscarEmpleadoPorDni(String dni);

    List<Empleado> listarEmpleados();

    void eliminarEmpleado(String dni);

}