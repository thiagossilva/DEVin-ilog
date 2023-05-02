package tech.devinhouse.server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.devinhouse.server.exception.NomeProibidoException;
import tech.devinhouse.server.exception.RegistroExistenteException;
import tech.devinhouse.server.exception.RegistroNaoEncontradoException;
import tech.devinhouse.server.model.Pessoa;
import tech.devinhouse.server.repository.PessoaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepo;

    public List<Pessoa> listar() {
        return pessoaRepo.findAll();
    }

    public Pessoa consultar(Integer id) {
        return pessoaRepo.findById(id)
                .orElseThrow(() -> new RegistroNaoEncontradoException());
    }

    public Pessoa inserir(Pessoa pessoa) {
        boolean nomeJaCadastrado = pessoaRepo.existsByNome(pessoa.getNome());
        if (nomeJaCadastrado)
            throw new RegistroExistenteException();
        if (pessoa.getNome().equals("invalido"))
            throw new NomeProibidoException();
        pessoa = pessoaRepo.save(pessoa);
        return pessoa;
    }

}
