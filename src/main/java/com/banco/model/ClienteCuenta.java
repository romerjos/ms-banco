package com.banco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteCuenta {

    private String dni;
    private String nombres;
    private String apellidos;
    private int edad;
    private String nroCuenta;
    private double saldo;
    private String tipoCuenta;

}