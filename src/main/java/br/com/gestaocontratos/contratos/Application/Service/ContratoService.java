package br.com.gestaocontratos.contratos.Application.Service;

import br.com.gestaocontratos.contratos.Application.Api.ContratoRequest;
import br.com.gestaocontratos.contratos.Application.Api.ContratoResponse;

import java.util.UUID;

public interface ContratoService {
    ContratoResponse criarContrato(UUID idCliente, ContratoRequest contratoRequest);
}
