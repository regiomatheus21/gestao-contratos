package br.com.gestaocontratos.cliente.application.repository;

import br.com.gestaocontratos.cliente.domain.Cliente;

public interface ClienteRepository {

    Cliente salva(Cliente cliente);
}
