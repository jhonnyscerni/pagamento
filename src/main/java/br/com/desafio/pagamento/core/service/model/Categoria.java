package br.com.desafio.pagamento.core.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Categoria {

    private String id;

    private String nome;

    private String descricao;


}