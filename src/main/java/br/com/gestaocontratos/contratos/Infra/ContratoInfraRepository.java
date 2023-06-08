package br.com.gestaocontratos.contratos.Infra;

import br.com.gestaocontratos.contratos.Application.Repository.ContratoRepository;
import br.com.gestaocontratos.contratos.Domain.Contrato;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

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
}
