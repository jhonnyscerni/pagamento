package br.com.desafio.pagamento.dataprovider.broker;

import br.com.desafio.pagamento.core.service.PaymentService.PaymentStatus;
import br.com.desafio.pagamento.core.service.model.Pagamento;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentStatusProducer {

    @Value("${pagamento.queue}")
    private String queue;

    private final RabbitTemplate rabbitTemplate;

    public PaymentStatusProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendPaymentStatus(Pagamento pagamento) {
        rabbitTemplate.convertAndSend(queue, pagamento);
    }
}