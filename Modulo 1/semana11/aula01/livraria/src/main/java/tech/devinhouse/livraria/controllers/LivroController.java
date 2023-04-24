package tech.devinhouse.livraria.controllers;


import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.livraria.dto.LivroRequest;
import tech.devinhouse.livraria.dto.LivroResponse;
import tech.devinhouse.livraria.models.Livro;
import tech.devinhouse.livraria.services.LivroService;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/livros")
@AllArgsConstructor
public class LivroController {

    private ModelMapper mapper;
    private LivroService service;

    @GetMapping
    public ResponseEntity<List<LivroResponse>> listar() {
        List<Livro> livros = service.consultar();
        List<LivroResponse> resp = new ArrayList<>();
        for(Livro livro: livros) {
            LivroResponse livroResp = mapper.map(livro, LivroResponse.class);
            resp.add(livroResp);
        }
        return ResponseEntity.ok(resp);
    }

    @GetMapping("{id}")
    public ResponseEntity<LivroResponse> consultarPeloId(@PathVariable("id") Integer id) {
        Livro livro = service.consultar(id);
        LivroResponse resp = mapper.map(livro, LivroResponse.class);
        return ResponseEntity.ok(resp);
    }

    @PostMapping
    public ResponseEntity<LivroResponse> criar(@RequestBody @Valid LivroRequest request) {
        Livro livro = mapper.map(request, Livro.class);
        livro = service.salvar(livro);
        LivroResponse resp = mapper.map(livro, LivroResponse.class);
        return ResponseEntity.created(URI.create(resp.getId().toString())).body(resp);
    }

    @PutMapping("{id}")
    public ResponseEntity<LivroResponse> atualizar(@PathVariable("id") Integer id, @RequestBody @Valid LivroRequest request) {
        Livro livro = mapper.map(request, Livro.class);
        livro.setId(id);
        livro = service.atualizar(livro);
        LivroResponse resp = mapper.map(livro, LivroResponse.class);
        return ResponseEntity.ok(resp);
    }

    @DeleteMapping("{id}")
    public ResponseEntity excluir(@PathVariable("id") Integer id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
