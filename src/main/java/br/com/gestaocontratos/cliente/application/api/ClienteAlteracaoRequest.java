package br.com.gestaocontratos.cliente.application.api;

import br.com.gestaocontratos.cliente.domain.Sexo;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Value
public class ClienteAlteracaoRequest {
    @NotBlank
    private String nome;
    private String cidade;
    private String bairro;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private Boolean aceitaTermos;
}
