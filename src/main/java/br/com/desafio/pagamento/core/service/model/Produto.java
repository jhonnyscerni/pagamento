package br.com.desafio.pagamento.core.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@Builder
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private int quantidade;
    private BigDecimal valor;
    private Categoria categoria;
}