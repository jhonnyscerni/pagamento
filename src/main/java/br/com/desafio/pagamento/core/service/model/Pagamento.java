package br.com.desafio.pagamento.core.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Pagamento {

    @JsonProperty("nomePagamento")
    private String nomePagamento;

    @JsonProperty("status")
    private String status;

    @JsonProperty("pedidoId")
    private String pedidoId;

    @JsonProperty("produtos")
    private List<Produto> produtos;
}