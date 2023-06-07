package br.com.gestaocontratos.contratos.Application.Api;

import br.com.gestaocontratos.contratos.Domain.TIPO;
import lombok.Value;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
@Value
public class ContratoRequest {
    @NotBlank
    private String nomeContrato;
    @Enumerated(EnumType.STRING)
    private TIPO tipo;
    @NotBlank
    private String valorContrato;
    @NotBlank
    private String dataVencimentoContrato;
    }
