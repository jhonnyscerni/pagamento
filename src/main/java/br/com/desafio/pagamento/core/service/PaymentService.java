package br.com.desafio.pagamento.core.service;

import br.com.desafio.pagamento.core.service.model.Pagamento;
import br.com.desafio.pagamento.core.service.model.Produto;
import br.com.desafio.pagamento.dataprovider.broker.PaymentStatusProducer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class PaymentService {

    private final PaymentStatusProducer paymentStatusProducer;

    public PaymentService(PaymentStatusProducer paymentStatusProducer) {
        this.paymentStatusProducer = paymentStatusProducer;
    }

    public enum PaymentStatus {
        SUCCESS,
        ERROR
    }

    public PaymentStatus simulatePayment(String orderId, List<Produto> produtos, String paymentName) {
        Random random = new Random();
        PaymentStatus status = random.nextBoolean() ? PaymentStatus.SUCCESS : PaymentStatus.ERROR;
        Pagamento pagamento = Pagamento.builder()
                .pedidoId(orderId)
                .produtos(produtos)
                .nomePagamento(paymentName)
                .status(status.toString())
                .build();
        paymentStatusProducer.sendPaymentStatus(pagamento);
        return status;
    }

}