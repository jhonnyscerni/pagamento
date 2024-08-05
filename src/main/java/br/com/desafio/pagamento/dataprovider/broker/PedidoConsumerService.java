package br.com.desafio.pagamento.dataprovider.broker;

import br.com.desafio.pagamento.core.service.PaymentService;
import br.com.desafio.pagamento.core.service.model.Pedido;
import br.com.desafio.pagamento.dataprovider.broker.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoConsumerService {

    @Autowired
    private PaymentService paymentService;

    @RabbitListener(queues = RabbitMQConfig.PEDIDO_QUEUE)
    public void consumeMessage(Pedido pedido) {
        System.out.println("Received message: " + pedido);
        paymentService.simulatePayment(pedido.getId(), pedido.getCarrinho().getProdutos(), "Cartão de Credito");
    }
}