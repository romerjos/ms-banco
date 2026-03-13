package com.banco.model;

public class ClienteCuenta {

    private String dni;
    private String nombres;
    private String apellidos;
    private int edad;
    private String nroCuenta;
    private double saldo;
    private String tipoCuenta;

    public ClienteCuenta(){}

    public ClienteCuenta(String dni, String nombres, String apellidos,
                         int edad, String nroCuenta, double saldo, String tipoCuenta) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // getters y setters
}