package br.com.gestaocontratos.cliente.domain;

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
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @CPF
    @Column(unique = true)
    private String cpf;
    @NotNull
    private boolean aceitaTermos;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;





}
