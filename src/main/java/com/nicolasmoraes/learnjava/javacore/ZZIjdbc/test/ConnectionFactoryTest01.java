package com.nicolasmoraes.learnjava.javacore.ZZIjdbc.test;

import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.domain.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01  {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
//        ProducerService.save(producer);
        ProducerService.delete(18);
        ProducerService.delete(19);
        ProducerService.delete(20);
        ProducerService.delete(21);
        ProducerService.delete(22);
        ProducerService.delete(23);
    }
}
