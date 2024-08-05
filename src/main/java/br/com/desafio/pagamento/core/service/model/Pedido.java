package br.com.desafio.pagamento.core.service.model;

import br.com.desafio.pagamento.core.service.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Pedido {

    private String id;

    private Carrinho carrinho;

    private LocalDateTime dataCriacao;

    private Status status;
}
