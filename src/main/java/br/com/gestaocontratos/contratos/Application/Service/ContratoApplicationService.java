package br.com.gestaocontratos.contratos.Application.Service;

import br.com.gestaocontratos.contratos.Application.Api.ContratoRequest;
import br.com.gestaocontratos.contratos.Application.Api.ContratoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ContratoApplicationService implements ContratoService {
    @Override
    public ContratoResponse criarContrato(UUID idCliente, ContratoRequest contratoRequest) {
        log.info("[inicia] ContratoApplicationService - criarContrato");
        log.info("[finaliza] ContratoApplicationService - criarContrato");
        return null;
    }
}
