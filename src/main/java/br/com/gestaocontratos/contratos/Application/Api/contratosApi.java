package br.com.gestaocontratos.contratos.Application.Api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/v1/cliente/{idCliente}/contrato")
public interface contratosApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ContratoResponse postContrato(@PathVariable UUID idCliente,
                                  @Valid @RequestBody ContratoRequest contratoRequest);
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ContratoListResponse> getContratoDoClienteComId(@PathVariable UUID idCliente);
    @GetMapping(value = "/{idContrato}")
    @ResponseStatus(code = HttpStatus.OK)
    ContratoListResponse getContratosPeloId(@PathVariable UUID idCliente,@PathVariable UUID idContrato);

    @DeleteMapping(value = "/{idContrato}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteContratoAtravesDoId(@PathVariable UUID idCliente,@PathVariable UUID idContrato);
    @PatchMapping(value = "/{idContrato}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void alteraContrato(@PathVariable UUID idCliente, @PathVariable UUID idContrato,
                        @Valid @RequestBody ContratoAlteracaoRequest contratoAlteracaoRequest);
}


