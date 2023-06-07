package br.com.gestaocontratos.cliente.application.repository;

import br.com.gestaocontratos.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {

    Cliente salva(Cliente cliente);

    List<Cliente> buscaTodosCliente();

    Cliente buscaClienteAtravesId(UUID idCliente);

    void deletaCliente(Cliente cliente);
}
