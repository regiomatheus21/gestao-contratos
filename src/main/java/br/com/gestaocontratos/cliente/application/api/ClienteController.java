package br.com.gestaocontratos.cliente.application.api;

import br.com.gestaocontratos.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteApi {
    private final ClienteService clienteService;
    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[inicia] ClienteController - postCliente");
        return clienteCriado;
    }

    @Override
    public List<ClienteListResponse> getTodosClientes() {
        log.info("[inicia] ClienteController - getTodosClientes");
        List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
        log.info("[finaliza] ClienteController - getTodosClientes");
        return clientes;
    }

    @Override
    public ClienteDetalhadoResponse getClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteController - getClienteAtravesId");
        log.info("[idCliente] {}" , idCliente);
        ClienteDetalhadoResponse clienteDetalhado=clienteService.buscaClienteAtravesId(idCliente);
        log.info("[finaliza] ClienteController - getClienteAtravesId");
        return clienteDetalhado;
    }

    @Override
    public void deleteClientePeloId(UUID IdCliente) {
        log.info("[inicia] ClienteController - deleteClientePeloId");
        log.info("[idCliente] {}" ,IdCliente);
        clienteService.deletaClientePeloId(IdCliente);
        log.info("[inicia] ClienteController - deleteClientePeloId");
    }

    @Override
    public void alteraDadosCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
        log.info("[inicia] ClienteController - alteraDadosCliente");
        log.info("[idCliente] {}" ,idCliente);
        clienteService.alteraDadosCliente(idCliente,clienteAlteracaoRequest);
        log.info("[finaliza] ClienteController - alteraDadosCliente");
    }


}
