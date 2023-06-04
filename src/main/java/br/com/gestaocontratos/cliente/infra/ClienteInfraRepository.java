package br.com.gestaocontratos.cliente.infra;

import br.com.gestaocontratos.cliente.application.repository.ClienteRepository;
import br.com.gestaocontratos.cliente.domain.Cliente;
import br.com.gestaocontratos.cliente.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;
    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository- salva");
        try {
            clienteSpringDataJPARepository.save(cliente);

        } catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST, "Existe dados duplicados");
        }
        log.info("[finaliza] ClienteInfraRepository- salva");

        return cliente;
    }

    @Override
    public List<Cliente> buscaTodosCliente() {
        log.info("[inicia] ClienteInfraRepository- buscaTodosCliente");
        List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
        log.info("[inicia] ClienteInfraRepository- buscaTodosCliente");
        return todosClientes;
    }
}
