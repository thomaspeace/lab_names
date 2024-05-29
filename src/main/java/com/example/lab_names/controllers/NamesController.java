package com.example.lab_names.controllers;

import com.example.lab_names.models.Celebration;
import com.example.lab_names.models.Greet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class NamesController {

    // /greeting?name=Tom&timeOfDay=Afternoon
    @GetMapping
    public Greet greeting(@RequestParam(defaultValue = "") String name, String timeOfDay){
        return new Greet(name, timeOfDay);
    }

    // /greeting/celebration?celebration=Happy Summer Solstice!
    @GetMapping(value = "/celebration")
    public Celebration celebrate(@RequestParam String celebration){
        return new Celebration(celebration);
    }


}
