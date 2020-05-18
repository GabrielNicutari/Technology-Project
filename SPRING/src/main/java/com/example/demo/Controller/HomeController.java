package com.example.demo.Controller;

import com.example.demo.Model.Game;
import com.example.demo.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/games")
    public String games(Model model) {
        List<Game> gameList = gameService.fetchAll();
        model.addAttribute("games", gameList);
        return "home/index";
    }


    @RequestMapping(value="/games/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    //@GetMapping("/games/delete/{id}")
    public String delete(int id) {
        gameService.deleteRow(id);
        return "redirect:/games";
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
