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
    public String games(Model model, String keyword) {
        List<Game> gameList = gameService.fetchAll();
        model.addAttribute("games", gameList);

        if (keyword != null) {
            if(keyword.equals("")) {
                return "redirect:/games";
            } else {
                model.addAttribute("games", gameService.findByKeyWord(keyword));
            }
        } else {
            model.addAttribute("games", gameService.fetchAll());
        }

        return "home/index";
    }

    @PostMapping(value="/games/add")
    public String add(@ModelAttribute Game g) {
        gameService.add(g);
        return "redirect:/games";
    }

    @RequestMapping(value="/games/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    //@GetMapping("/games/delete/{id}")
    public String delete(int id) {
        gameService.deleteRow(id);
        return "redirect:/games";
    }

    //UPDATE METHOD
    @RequestMapping(value="/games/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Game g) {
       gameService.update(g);
        return "redirect:/games";
    }
}
