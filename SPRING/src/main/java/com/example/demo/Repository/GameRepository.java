package com.example.demo.Repository;

import com.example.demo.Model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
  
    public void add(Game g) {
        String query = "INSERT INTO games(name, genre, rating, mode, releaseDate, developer, publisher, engine)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        template.update(query, g.getName(), g.getGenre(), g.getRating(), g.getMode(), g.getReleaseDate(),
                g.getDeveloper(), g.getPublisher(), g.getEngine());
    }

    public Boolean deleteRow(int id) {
        String query = "DELETE FROM games WHERE id = ?";
        return template.update(query, id) < 0;
    }

    public List<Game> findByKeyWord(String keyword) {
        String query = "SELECT * FROM games WHERE name LIKE '%" + keyword + "%'";
        RowMapper<Game> rowMapper = new BeanPropertyRowMapper<>(Game.class);
        return template.query(query, rowMapper);
    }

    public Game findById(int id) {
        String query = "SELECT * FROM games WHERE id = ?";
        RowMapper<Game> rowMapper = new BeanPropertyRowMapper<>(Game.class);
        return template.queryForObject(query, rowMapper, id);
    }

    public void update(Game g, int id) {
        String query = "INSERT INTO games(name, genre, rating, mode, releaseDate, developer, publisher, engine)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?) WHERE id= ?";
        template.update(query, g.getName(), g.getGenre(), g.getRating(), g.getMode(), g.getReleaseDate(),
                g.getDeveloper(), g.getPublisher(), g.getEngine(), id);
    }
}
