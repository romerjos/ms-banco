package com.banco.repository;
import com.banco.model.ClienteCuenta;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Override
    public ClienteCuenta obtenerClientePorCodigo(String codCliente) {

        // Simulación de base de datos
        if(codCliente.equals("C001")) {
            return new ClienteCuenta(
                    "12345678",
                    "Juan",
                    "Perez",
                    35,
                    "001-456789",
                    15000.50,
                    "AHORROS"
            );
        }

        return null;
    }
}