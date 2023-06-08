package br.com.gestaocontratos.contratos.Infra;

import br.com.gestaocontratos.contratos.Domain.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ContratoSpringDataJPARepository extends JpaRepository<Contrato, UUID> {
    List<Contrato> findByidClienteContrato(UUID idCliente);
}
