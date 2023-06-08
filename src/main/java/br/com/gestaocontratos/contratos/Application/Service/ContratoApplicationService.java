package br.com.gestaocontratos.contratos.Application.Service;

import br.com.gestaocontratos.cliente.application.service.ClienteService;
import br.com.gestaocontratos.contratos.Application.Api.ContratoListResponse;
import br.com.gestaocontratos.contratos.Application.Api.ContratoRequest;
import br.com.gestaocontratos.contratos.Application.Api.ContratoResponse;
import br.com.gestaocontratos.contratos.Application.Repository.ContratoRepository;
import br.com.gestaocontratos.contratos.Domain.Contrato;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ContratoApplicationService implements ContratoService {
    private final ClienteService clienteService;
    private final ContratoRepository contratoRepository;
    @Override
    public ContratoResponse criarContrato(UUID idCliente, ContratoRequest contratoRequest) {
        log.info("[inicia] ContratoApplicationService - criarContrato");
        clienteService.buscaClienteAtravesId(idCliente);
        Contrato contrato = contratoRepository.salvaContrato(new Contrato(idCliente,contratoRequest));
        log.info("[finaliza] ContratoApplicationService - criarContrato");
        return new ContratoResponse(contrato.getIdContrato());
    }

    @Override
    public List<ContratoListResponse> buscarContratosAtravesDoId(UUID idCliente) {
        log.info("[inicia] ContratoApplicationService - buscarContratosAtravesDoId");
        clienteService.buscaClienteAtravesId(idCliente);
        List<Contrato> contratosDoCliente = contratoRepository.buscarContratosAtravesId(idCliente);
        log.info("[Finaliza] ContratoApplicationService - buscarContratosAtravesDoId");
        return ContratoListResponse.converte(contratosDoCliente);
    }

    @Override
    public ContratoListResponse buscaContratoDoClienteComID(UUID idCliente, UUID idContrato) {
        log.info("[inicia] ContratoApplicationService - buscaContratoDoClienteComID");

        log.info("[finaliza] ContratoApplicationService - buscaContratoDoClienteComID");
        return null;
    }
}
