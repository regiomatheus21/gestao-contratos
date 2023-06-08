package br.com.gestaocontratos.cliente.application.api;

import br.com.gestaocontratos.cliente.domain.Cliente;
import br.com.gestaocontratos.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;
@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nome;
    private String cpf;
    private String email;
    private String contato;
    private String cidade;
    private String bairro;
    private Sexo sexo;
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;

    public ClienteDetalhadoResponse (Cliente cliente){
        this.idCliente=cliente.getIdCliente();
        this.nome=cliente.getNome();
        this.cpf= cliente.getCpf();
        this.email=cliente.getEmail();
        this.contato= cliente.getContato();
        this.cidade = cliente.getCidade();
        this.bairro = cliente.getBairro();
        this.sexo = cliente.getSexo();
        this.aceitaTermos=cliente.getAceitaTermos();
        this.dataHoraDoCadastro= cliente.getDataHoraDoCadastro();
    }
}
