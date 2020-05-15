package com.example.demo.Service;

import com.example.demo.Model.Person;
import com.example.demo.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    //List<Person> persons = new ArrayList<>();

    public List<Person> fetchAll() {
        //personRepository.fetchAll().forEach(persons::add);  //Get everything from the db and add it into an arraylist
        return personRepository.fetchAll();
    }

//    public Person getPerson(int id) {
//        return persons.stream().filter(p -> p.getId() == id).findFirst().get();
//    }

//    public void addPerson(Person person) {
//        personRepository.save(person);
//    }
}
