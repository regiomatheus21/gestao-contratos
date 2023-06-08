package br.com.gestaocontratos.contratos.Application.Api;

import br.com.gestaocontratos.contratos.Domain.Contrato;
import br.com.gestaocontratos.contratos.Domain.TIPO;
import lombok.Getter;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
public class ContratoListResponse {
    private UUID idContrato;
    private String nomeContrato;
    private TIPO tipo;
    private String valorContrato;
    private String dataVencimentoContrato;

    public static List<ContratoListResponse> converte(List<Contrato> ContratosDoCliente){
        return ContratosDoCliente.stream()
                .map(ContratoListResponse::new)
                .collect(Collectors.toList());
    }
    public ContratoListResponse (Contrato contrato){
        this.idContrato =contrato.getIdContrato();
        this.nomeContrato=contrato.getNomeContrato();
        this.tipo=contrato.getTipo();
        this.valorContrato= contrato.getValorContrato();
        this.dataVencimentoContrato=contrato.getDataVencimentoContrato();
    }
}
