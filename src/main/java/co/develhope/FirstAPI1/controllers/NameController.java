package co.develhope.FirstAPI1.controllers;

import co.develhope.FirstAPI1.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tania Ielpo
 */

@RestController
@RequestMapping

public class NameController {

    private String name="Tania";
    private NameService nameService;
    @Autowired
    public NameController(NameService nameService){
        this.nameService=nameService;
    }

    @GetMapping("/name")
    public String getname(){
        return name;
    }

    @PostMapping("/name")
    public String reversedName(){
        return nameService.reversedName(name);
    }
}