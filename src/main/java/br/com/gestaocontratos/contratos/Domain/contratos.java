package br.com.gestaocontratos.contratos.Domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class contratos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid",name = "idContrato",updatable = false,unique = true,nullable = false)
    private UUID idContrato;
    @NotNull
    @Column(columnDefinition = "uuid",name = "idCliente",nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeContrato;
    @Enumerated(EnumType.STRING)
    private TIPO tipo;
    @NotBlank
    private String valorContrato;
    @NotBlank
    private String dataVencimentoContrato;

    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraUltimaAtualizacao;
}
