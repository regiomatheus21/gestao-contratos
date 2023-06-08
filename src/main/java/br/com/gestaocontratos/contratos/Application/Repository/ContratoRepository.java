package br.com.gestaocontratos.contratos.Application.Repository;

import br.com.gestaocontratos.contratos.Domain.Contrato;

import java.util.List;
import java.util.UUID;

public interface ContratoRepository {

    Contrato salvaContrato(Contrato contrato);

    List<Contrato> buscarContratosAtravesId(UUID idCliente);

    Contrato buscarContratoPeloId(UUID idContrato);
}
