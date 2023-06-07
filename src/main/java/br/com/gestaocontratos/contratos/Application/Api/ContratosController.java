package br.com.gestaocontratos.contratos.Application.Api;

import br.com.gestaocontratos.contratos.Application.Service.ContratoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ContratosController implements contratosApi {
    private final ContratoService contratoService;
    @Override
    public ContratoResponse postContrato(UUID idCliente, ContratoRequest contratoRequest) {
        log.info("[inicia] ContratosController - postContrato ");
        log.info("[idCliente] {}", idCliente);
        ContratoResponse contrato = contratoService.criarContrato(idCliente,contratoRequest);
        log.info("[finaliza] ContratosController - postContrato ");
        return contrato;
    }
}
