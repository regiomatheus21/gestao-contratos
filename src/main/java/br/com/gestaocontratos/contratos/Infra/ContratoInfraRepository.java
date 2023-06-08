package br.com.gestaocontratos.contratos.Infra;

import br.com.gestaocontratos.contratos.Application.Repository.ContratoRepository;
import br.com.gestaocontratos.contratos.Domain.Contrato;
import br.com.gestaocontratos.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ContratoInfraRepository implements ContratoRepository {
    private final ContratoSpringDataJPARepository contratoSpringJPARepository;
    @Override
    public Contrato salvaContrato(Contrato contrato) {
        log.info("[inicia] ContratoInfraRepository - salvaContratro");
        contratoSpringJPARepository.save(contrato);
        log.info("[finaliza] ContratoInfraRepository - salvaContratro");
        return contrato;
    }

    @Override
    public List<Contrato> buscarContratosAtravesId(UUID idCliente) {
        log.info("[inicia] ContratoInfraRepository -buscarContratosAtravesId");
        var Contratos = contratoSpringJPARepository.findByidClienteContrato(idCliente);
        log.info("[finaliza] ContratoInfraRepository -buscarContratosAtravesId");
        return Contratos;
    }

    @Override
    public Contrato buscarContratoPeloId(UUID idContrato) {
        log.info("[inicia] ContratoInfraRepository -buscarContratoPeloId");
        var contrato = contratoSpringJPARepository.findById(idContrato)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND,"Contrato não encontrado para o idContrato = "+ idContrato));
        log.info("[finaliza] ContratoInfraRepository -buscarContratoPeloId");
        return contrato;
    }

    @Override
    public void deletaContrato(Contrato contrato) {
        log.info("[inicia] ContratoInfraRepository -deletaContrato");
        contratoSpringJPARepository.delete(contrato);
        log.info("[finaliza] ContratoInfraRepository -deletaContrato");

    }
}
