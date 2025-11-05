package com.nicolasmoraes.learnjava.javacore.ZZIjdbc.repository;

import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer)  {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
