package br.com.gestaocontratos.contratos.Domain;

import br.com.gestaocontratos.contratos.Application.Api.ContratoRequest;
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
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid",name = "idContrato",updatable = false,unique = true,nullable = false)
    private UUID idContrato;
    @NotNull
    @Column(columnDefinition = "uuid",name = "idCliente",nullable = false)
    private UUID idClienteContrato;
    @NotBlank
    private String nomeContrato;
    @Enumerated(EnumType.STRING)
    private TIPO tipo;

    private Integer valorContrato;
    @NotBlank
    private String dataVencimentoContrato;

    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraUltimaAtualizacao;

    public Contrato (UUID idCliente, ContratoRequest contratoRequest){
        this.idClienteContrato= idCliente;
        this.nomeContrato= contratoRequest.getNomeContrato();
        this.dataVencimentoContrato= contratoRequest.getDataVencimentoContrato();
        this.valorContrato=contratoRequest.getValorContrato();
        this.tipo=contratoRequest.getTipo();
        this.dataHoraCadastro= LocalDateTime.now();
    }
}
