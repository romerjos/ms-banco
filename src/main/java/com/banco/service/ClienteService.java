package com.banco.service;

import com.banco.model.ClienteCuenta;
import com.banco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteCuenta obtenerCliente(String codCliente){
        return clienteRepository.obtenerClientePorCodigo(codCliente);
    }

}