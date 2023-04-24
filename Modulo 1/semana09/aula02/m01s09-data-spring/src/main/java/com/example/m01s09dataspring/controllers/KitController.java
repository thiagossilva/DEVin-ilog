package com.example.m01s09dataspring.controllers;

import com.example.m01s09dataspring.models.Kit;
import com.example.m01s09dataspring.services.KitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "kit")
public class KitController {

    @Autowired
    private KitService kitService;

    @GetMapping
    public List<Kit> get() {
        return kitService.get();
    }

    @GetMapping(path = "validadeBetween")
    public List<Kit> validadeBetween(
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dataInicial,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dataFinal
    ) {
        return kitService.findByValidade(dataInicial, dataFinal);
    }

    @PostMapping
    public Kit post(@RequestBody Kit kit) {
        return kitService.save(kit);
    }

    @PutMapping
    public Kit put(@RequestBody Kit kit) {
        return kitService.save(kit);
    }

    @DeleteMapping
    public boolean delete(Integer id) {
        return kitService.remove(id);
    }

}