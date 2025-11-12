package com.nicolasmoraes.learnjava.javacore.ZZIjdbc.test;

import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.domain.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01  {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();

//        ProducerService.save(producer);
//        ProducerService.delete(19);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> byNameAndUpdateToUpperCase = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> byNameAndUpdateToUpperCase = ProducerService.findByNameAndInsertWhenNotFound("A-1 Pictures");
//        log.info("Producers found '{}'", byNameAndUpdateToUpperCase);
//        ProducerService.findByNameAndDelete("A-1 Pictures");
//        List<Producer> byNamePreparedStatement = ProducerService.findByNamePreparedStatement("Bo");
//        log.info("Producers found '{}'", byNamePreparedStatement);
//        ProducerService.updatePrepareStatement(producerToUpdate);
        List<Producer> byNameCallableStatement = ProducerService.findByNameCallableStatement("Bo");
        log.info("Producers found '{}'", byNameCallableStatement);

    }
}
