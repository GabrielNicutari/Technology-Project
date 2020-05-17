package com.example.demo.Repository;

import com.example.demo.Model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GameRepository {

    @Autowired
    JdbcTemplate template;

    public List<Game> fetchAll() {
        String query = "SELECT * FROM games";
        RowMapper<Game> rowMapper = new BeanPropertyRowMapper<>(Game.class);
        return template.query(query, rowMapper);
    }

    public Boolean deleteRow(int id) {
        String query = "DELETE FROM games WHERE id = ?";
        return template.update(query, id) < 0;
    }
}
