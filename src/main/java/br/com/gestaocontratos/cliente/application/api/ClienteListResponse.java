package br.com.gestaocontratos.cliente.application.api;

import br.com.gestaocontratos.cliente.domain.Cliente;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Value
public class ClienteListResponse {
    private UUID idCliente;
    private String nome;
    private String cpf;
    private String email;
    private String cidade;
    private String bairro;
    private String contato;

    public static List<ClienteListResponse> converte(List<Cliente> clientes){
        return clientes.stream()
                .map(ClienteListResponse::new)
                .collect(Collectors.toList());
    }
    private ClienteListResponse (Cliente cliente){
        super();
        this.idCliente= cliente.getIdCliente();
        this.nome=cliente.getNome();
        this.cidade = cliente.getCidade();
        this.bairro = cliente.getBairro();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.contato= cliente.getContato();
    }
}


