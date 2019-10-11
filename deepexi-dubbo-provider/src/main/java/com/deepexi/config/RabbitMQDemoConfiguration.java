package com.deepexi.config;

import com.deepexi.model.dto.MQDemoDTO;
import com.deepexi.service.MQDemoService;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(RabbitMQDemoConfiguration.Receiver.class)
public class RabbitMQDemoConfiguration {

    @Bean
    public Queue test() {
        return new Queue("test.queue");
    }

    @RabbitListener(queues = "test.queue")
    public class Receiver {
        @Autowired
        private MQDemoService service;

        @RabbitHandler
        public void process(MQDemoDTO data) {
            service.consume(data);
        }
    }

}

