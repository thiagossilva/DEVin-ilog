package tech.devinhouse.server.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.server.dto.PessoaRequest;
import tech.devinhouse.server.dto.PessoaResponse;
import tech.devinhouse.server.model.Pessoa;
import tech.devinhouse.server.service.PessoaService;

import java.net.URI;
import java.util.*;

@RestController
@RequestMapping("/api/pessoas")
@RequiredArgsConstructor
@CrossOrigin
public class PessoaController {

    private final PessoaService pessoaService;

    private ModelMapper mapper = new ModelMapper(); // criado instancia aqui sem ser final pra nao ser injetado e pq soh vai usar aqui

    @GetMapping
    public ResponseEntity<List<PessoaResponse>> consultar() {
        var pessoas = pessoaService.listar();
        var resp = pessoas.stream()
                .map(pessoa -> mapper.map(pessoa, PessoaResponse.class)).toList();
        return ResponseEntity.ok(resp);
    }

    @GetMapping("{id}")
    public ResponseEntity<PessoaResponse> consultarPorId(@PathVariable Integer id) {
        var pessoa = pessoaService.consultar(id);
        var resp = mapper.map(pessoa, PessoaResponse.class);
        return ResponseEntity.ok(resp);
    }

    @PostMapping
    public ResponseEntity<PessoaResponse> inserir(@RequestBody @Valid PessoaRequest request) {
        var pessoa = mapper.map(request, Pessoa.class);
        pessoa = pessoaService.inserir(pessoa);
        var resp = mapper.map(pessoa, PessoaResponse.class);
        return ResponseEntity.created(URI.create(resp.getId().toString())).body(resp);
    }

}
