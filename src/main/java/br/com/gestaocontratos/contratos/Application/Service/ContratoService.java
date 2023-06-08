package br.com.gestaocontratos.contratos.Application.Service;

import br.com.gestaocontratos.contratos.Application.Api.ContratoListResponse;
import br.com.gestaocontratos.contratos.Application.Api.ContratoRequest;
import br.com.gestaocontratos.contratos.Application.Api.ContratoResponse;

import java.util.List;
import java.util.UUID;

public interface ContratoService {
    ContratoResponse criarContrato(UUID idCliente, ContratoRequest contratoRequest);

    List<ContratoListResponse> buscarContratosAtravesDoId(UUID idCliente);

    ContratoListResponse buscaContratoDoClienteComID(UUID idCliente, UUID idContrato);
}
