package com.example.m01s09dataspring.repositories;

import com.example.m01s09dataspring.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    Pessoa findByIdAndTutorIsNotNull(Integer id);

}
