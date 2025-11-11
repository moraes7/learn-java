package com.nicolasmoraes.learnjava.javacore.ZZIjdbc.service;

import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.domain.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    // insert
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    // delete
    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    // update
    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    // updatePreparedStatement
    public static void updatePrepareStatement(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.updatePrepareStatement(producer);
    }

    // findAll
    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    // findByName
    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    // findByNamePreparedStatement
    public static List<Producer> findByNamePreparedStatement(String name) {
        return ProducerRepository.findByNamePreparedStatement(name);
    }

    // showProducerMetaData
    public static void showProducerMetaData() {
        ProducerRepository.showProducerMetaData();
    }

    // showDriverMetaData
    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }

    // showTypeScrollWorking
    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    // findByNameAndUpdateToUpperCase
    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    // findByNameAndInsertWhenNotFound
    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    // findByNameAndDelete
    public static void findByNameAndDelete(String name) {
        ProducerRepository.findByNameAndDelete(name);
    }

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
