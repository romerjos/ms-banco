package com.banco.repository;

import com.banco.model.ClienteCuenta;

public interface ClienteRepository {

    ClienteCuenta obtenerClientePorCodigo(String codCliente);

}