package br.com.gestaocontratos.cliente.application.service;

import br.com.gestaocontratos.cliente.application.api.*;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);


    List<ClienteListResponse> buscaTodosClientes();

    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);

    void deletaClientePeloId(UUID idCliente);

    void alteraDadosCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
}
