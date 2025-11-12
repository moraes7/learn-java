package com.nicolasmoraes.learnjava.javacore.ZZIjdbc.test;

import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.domain.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        ProducerServiceRowSet.updateByNameJdbcRowSet(producerToUpdate);
        log.info("--------------------------");
        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
        log.info("Producers found ´{}'", producers);
    }
}
