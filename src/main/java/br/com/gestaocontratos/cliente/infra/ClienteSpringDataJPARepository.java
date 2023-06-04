package br.com.gestaocontratos.cliente.infra;

import br.com.gestaocontratos.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClienteSpringDataJPARepository extends JpaRepository <Cliente, UUID> {
    Optional<Cliente> findByIdCliente(UUID idCliente);
}
