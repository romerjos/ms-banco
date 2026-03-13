package com.banco;

import com.bank.model.ClienteCuenta;
public interface ClienteRepository {

    ClienteCuenta obtenerClientePorCodigo(String codCliente);

}