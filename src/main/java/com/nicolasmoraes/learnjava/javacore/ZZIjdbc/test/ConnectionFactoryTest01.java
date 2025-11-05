package com.nicolasmoraes.learnjava.javacore.ZZIjdbc.test;

import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.domain.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01  {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("NHK").build();
        ProducerRepository.save(producer);
    }
}
