package co.develhope.FirstAPI1.controllers;

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

    @GetMapping
    public String getname(){
        return name;
    }
    @PostMapping
    public String reversedName(){
        StringBuilder str=new StringBuilder(name);
        return str.reverse().toString();
    }
}