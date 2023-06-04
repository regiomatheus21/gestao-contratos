package br.com.gestaocontratos.cliente.application.api;

import br.com.gestaocontratos.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<ClienteResponse> getTodosClientes() {
        log.info("[inicia] ClienteController -getTodosClientes");
        log.info("[inicia] ClienteController -getTodosClientes");
        return null;
    }
}
