package tech.devinhouse.exercicios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.exercicios.models.Produto;
import tech.devinhouse.exercicios.services.ProdutoService;

import java.util.List;

@RestController
@RequestMapping(path = "produto")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> get() {
        return produtoService.findAll();
    }

    @PostMapping
    public Produto post(@RequestBody Produto produto) throws Exception  {
        return produtoService.save(produto);
    }

    @PutMapping
    public Produto put(@RequestBody Produto produto) throws Exception  {
        return produtoService.save(produto);
    }

    @DeleteMapping
    public boolean delete(Integer id) {
        return produtoService.delete(id);
    }
}
