package com.banco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    private String dni;
    private String nombre;
    private String apellidos;
    private String puesto;
    private int edad;

}