package tech.devinhouse.devgram.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import tech.devinhouse.devgram.exception.RegistroExistenteException;
import tech.devinhouse.devgram.exception.RegistroNaoEncontradoException;
import tech.devinhouse.devgram.models.Perfil;
import tech.devinhouse.devgram.models.Status;
import tech.devinhouse.devgram.repositories.PerfilRepository;

@Service
@AllArgsConstructor
public class PerfilService {

    private PerfilRepository perfilRepository;

    public List<Perfil> consultar(Integer tamanho, Integer pagina, String ordenacao, String direcao) {
//        return repo.findAll();
        Sort.Direction direcaoSort = Sort.Direction.valueOf(direcao);
        PageRequest pageable = PageRequest.of(pagina, tamanho).withSort(direcaoSort, ordenacao);
        Page<Perfil> page = perfilRepository.findAll(pageable);
        return page.toList();
    }

    public List<Perfil> consultar(Status status) {
        return perfilRepository.findByStatus(status);
    }

    public Perfil consultar(String nome) {
        Optional<Perfil> perfilOptional = perfilRepository.findById(nome);
      // return perfilOpt.orElseThrow(() -> new RegistroNaoEncontradoException("Perfil", nome));
        if (perfilOptional.isPresent())
            return perfilOptional.get();
        throw new RegistroNaoEncontradoException("Perfil", nome);
    }

    public Perfil criar(Perfil perfil) {
        boolean existe = perfilRepository.existsById(perfil.getNome());
        if (existe)
            throw  new RegistroExistenteException("Perfil", perfil.getNome());
        perfil.setDataCriacao(LocalDateTime.now());
        perfil.setDataAtualizacao(LocalDateTime.now());
        perfilRepository.save(perfil);
        return perfil;
    }

    public Perfil atualizar(Perfil perfil) {
        Optional<Perfil> perfilOptional = perfilRepository.findById(perfil.getNome());
        if (perfilOptional.isEmpty())
            throw new RegistroNaoEncontradoException("Perfil", perfil.getNome());
            Perfil perfilExistente = perfilOptional.get();
            perfilExistente.setBiografia(perfil.getBiografia());
            perfilExistente.setProfissao(perfil.getProfissao());
            perfilExistente.setDataNascimento(perfil.getDataNascimento());
            perfilExistente.setDataAtualizacao(perfil.getDataAtualizacao());
            perfilRepository.save(perfilExistente);
            return perfilExistente;
    }

    public void excluir(String nome) {
        boolean existe = perfilRepository.existsById(nome);
        if (!existe) {
            throw new RegistroNaoEncontradoException("Perfil", nome);
        }
        perfilRepository.deleteById(nome);
    }
}
