package com.example.demo.Controller;

import com.example.demo.Model.Person;
import com.example.demo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/persons")
    public String persons(Model model) {
        List<Person> personList = personService.fetchAll();
        model.addAttribute("persons", personList);
        return "home/index";
    }

//    public List<Person> getAllPersons() {
//        return personService.fetchAll();
//    }
//
//    @RequestMapping("/persons/{id}")
//    public Person getPerson(@PathVariable int id) {
//        return personService.getPerson(id);
//    }

//    @RequestMapping(method = RequestMethod.POST, value = "/persons")
//    public void addPerson(@RequestBody Person person) {
//        personService.addPerson(person);
//    }
}
