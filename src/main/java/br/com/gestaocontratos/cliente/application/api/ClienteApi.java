package br.com.gestaocontratos.cliente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/v1/cliente")
@RestController
public interface ClienteApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);


}
