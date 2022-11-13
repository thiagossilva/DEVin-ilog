package tech.devinhouse.exercicios.services;

import org.springframework.stereotype.Service;
import tech.devinhouse.exercicios.models.Produto;
import tech.devinhouse.exercicios.repositories.ProdutoRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Produto save(Produto produto) throws Exception {
        if (
                produto.getValorUnitario() != null &&
                        produto.getValorUnitario().compareTo(BigDecimal.ZERO) < 0
        ) {
            throw new Exception("Valor unitário deve ser maior que ZERO!");
        }

        if (produto.getSku() == null || produto.getSku().isEmpty()) {
            throw new Exception("SKU é obrigatório!");
        }

        if (produto.getId() != null) {
            if (produtoRepository.existsByIdNotAndSku(produto.getId(), produto.getSku())) {
                throw new Exception("SKU já existente!");
            }
        } else {
            if (produtoRepository.existsBySku(produto.getSku())) {
                throw new Exception("SKU já existente!");
            }
        }

        return produtoRepository.save(produto);
    }

    public boolean delete(Integer id) {
        try {
            produtoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}