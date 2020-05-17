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



//    public Person getPerson(int id) {
//        return persons.stream().filter(p -> p.getId() == id).findFirst().get();
//    }

//    public void addPerson(Person person) {
//        personRepository.save(person);
//    }
}
