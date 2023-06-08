package br.com.gestaocontratos.contratos.Application.Repository;

import br.com.gestaocontratos.contratos.Domain.Contrato;

public interface ContratoRepository {

    Contrato salvaContrato(Contrato contrato);
}
