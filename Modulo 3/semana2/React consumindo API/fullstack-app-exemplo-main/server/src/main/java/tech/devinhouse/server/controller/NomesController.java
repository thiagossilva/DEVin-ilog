package tech.devinhouse.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.server.dto.NomeRequest;
import tech.devinhouse.server.service.NomeService;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class NomesController {

    @Autowired
    private NomeService service;

    @GetMapping
    public ResponseEntity<List<String>> consultarNomes() {
        List<String> nomes = service.obterNomes();
        return ResponseEntity.ok(nomes);
    }

    @PostMapping
    public ResponseEntity<String> adicionarNome(@RequestBody NomeRequest request) {
        service.adicionar(request.getNome());
        return ResponseEntity.ok(request.getNome());
    }

}
