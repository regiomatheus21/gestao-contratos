package br.com.gestaocontratos.contratos.Application.Api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ContratosController implements contratosApi {
    @Override
    public ContratoResponse postContrato(UUID idCliente, ContratoRequest contratoRequest) {
        log.info("[inicia] ContratosController - postContrato ");
        log.info("[finaliza] ContratosController - postContrato ");
        return null;
    }
}
