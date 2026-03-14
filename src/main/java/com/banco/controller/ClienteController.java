package com.banco.controller;

import com.banco.model.ClienteCuenta;
import com.banco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/banco")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/{codCliente}")
    public ClienteCuenta obtenerCliente(@PathVariable String codCliente){
        return clienteService.obtenerCliente(codCliente);
    }

}