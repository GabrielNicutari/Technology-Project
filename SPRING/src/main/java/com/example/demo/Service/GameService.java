package com.example.demo.Service;

import com.example.demo.Model.Game;
import com.example.demo.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //List<Person> persons = new ArrayList<>();

    public List<Game> fetchAll() {
        //personRepository.fetchAll().forEach(persons::add);  //Get everything from the db and add it into an arraylist
        return gameRepository.fetchAll();
    }

    public boolean deleteRow(int id) {
        return gameRepository.deleteRow(id);
    }
<<<<<<< Updated upstream
=======

    //Get games by keyword
    public List<Game> findByKeyWord(String keyword) {
        return gameRepository.findByKeyWord(keyword);
    }
  
    //UPDATE METHOD
    //public void update(Game) {
        //gameRepository.save(Game);
    //}
>>>>>>> Stashed changes
}
