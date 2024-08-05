package br.com.desafio.pagamento.core.service.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Carrinho {

    private String id;

    private List<Produto> produtos;

    private int quantidade;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataAlteracao;
}