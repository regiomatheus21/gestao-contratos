package br.com.gestaocontratos.cliente.application.api;

import br.com.gestaocontratos.cliente.domain.Sexo;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Value
public class ClienteRequest {
    @NotBlank
    private String nome;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String contato;
    @NotBlank
    private String cidade;
    @NotBlank
    private String bairro;
    @NotNull
    private String dataNascimento;
    private Sexo sexo;
    @CPF
    private String cpf;
    @NotNull
    private Boolean aceitaTermos;

}
