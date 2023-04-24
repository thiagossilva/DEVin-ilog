package com.example.m01s09dataspring.services;

import com.example.m01s09dataspring.models.Pessoa;
import com.example.m01s09dataspring.models.Tutor;
import com.example.m01s09dataspring.repositories.PessoaRepository;
import com.example.m01s09dataspring.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired private TutorService tutorService;
    @Autowired private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Pessoa save(Pessoa pessoa) {

        Tutor tutor;
        if (pessoa.getId() != null) {
            // Editando o tutor
            tutor = pessoaRepository.findByIdAndTutorIsNotNull(pessoa.getId()).getTutor();
        } else {
            // Criando o tutor
            tutor = new Tutor();
        }
        tutor.setNome(pessoa.getNome());

        pessoa.setTutor(tutorService.save(tutor));
        return pessoaRepository.save(pessoa);

    }
}