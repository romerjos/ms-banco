package com.banco.repository;


import com.banco.model.Empleado;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmpleadoRepositoryImpl implements EmpleadoRepository {

    private Map<String, Empleado> empleados = new HashMap<>();

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        empleados.put(empleado.getDni(), empleado);
        return empleado;
    }

    @Override
    public Empleado buscarEmpleadoPorDni(String dni) {
        return empleados.get(dni);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return new ArrayList<>(empleados.values());
    }

    @Override
    public void eliminarEmpleado(String dni) {
        empleados.remove(dni);
    }
}