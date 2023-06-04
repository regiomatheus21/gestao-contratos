package br.com.gestaocontratos.cliente.application.service;

import br.com.gestaocontratos.cliente.application.api.ClienteListResponse;
import br.com.gestaocontratos.cliente.application.api.ClienteRequest;
import br.com.gestaocontratos.cliente.application.api.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);


    List<ClienteListResponse> buscaTodosClientes();
}
