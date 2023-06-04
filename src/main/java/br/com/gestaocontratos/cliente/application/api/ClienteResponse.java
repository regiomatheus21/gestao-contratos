package br.com.gestaocontratos.cliente.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;
@Value
@Builder
public class ClienteResponse {
    private UUID idCliente;
}
