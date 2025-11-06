package com.nicolasmoraes.learnjava.javacore.ZZIjdbc.test;

import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.domain.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01  {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        ProducerRepository.save(producer);
//        log.info("INFO");
//        log.debug("DEBUG");
//        log.warn("WARN");
//        log.trace("TRACE");
    }
}
