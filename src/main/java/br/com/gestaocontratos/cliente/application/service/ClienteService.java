package br.com.gestaocontratos.cliente.application.service;

import br.com.gestaocontratos.cliente.application.api.ClienteRequest;
import br.com.gestaocontratos.cliente.application.api.ClienteResponse;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
