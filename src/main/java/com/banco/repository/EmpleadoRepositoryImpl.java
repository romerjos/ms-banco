package com.banco.repository;

import com.banco.model.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public class EmpleadoRepositoryImpl implements EmpleadoRepository {

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {

        // Simulación de guardado en base de datos
        System.out.println("Empleado registrado: " + empleado.getNombre());

        return empleado;
    }
}