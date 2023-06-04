package br.com.gestaocontratos.cliente.application.repository;

import br.com.gestaocontratos.cliente.domain.Cliente;

import java.util.List;

public interface ClienteRepository {

    Cliente salva(Cliente cliente);

    List<Cliente> buscaTodosCliente();
}
