package br.com.gestaocontratos.cliente.domain;

import br.com.gestaocontratos.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid",name="id",updatable = false,unique = true,nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nome;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    private String contato;
    @NotBlank
    private String cidade;
    @NotBlank
    private String bairro;
    @NotNull
    private String dataNascimento;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @CPF
    @Column(unique = true)
    private String cpf;
    @NotNull
    private boolean aceitaTermos;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Cliente (ClienteRequest clienteRequest){
        this.nome = clienteRequest.getNome();
        this.email= clienteRequest.getEmail();
        this.contato = clienteRequest.getContato();
        this.sexo = clienteRequest.getSexo();
        this.cidade = clienteRequest.getCidade();
        this.bairro= clienteRequest.getBairro();
        this.dataNascimento=clienteRequest.getDataNascimento();
        this.cpf=clienteRequest.getCpf();
        this.aceitaTermos=clienteRequest.getAceitaTermos();
        this.dataHoraDoCadastro=LocalDateTime.now();
    }





}
