package com.example.m01s09dataspring.controllers;

import com.example.m01s09dataspring.models.Pessoa;
import com.example.m01s09dataspring.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "pessoa")
public class PessoaController {

    @Autowired private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> get() {
        return pessoaService.findAll();
    }

    @PostMapping
    public Pessoa post(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }
}
