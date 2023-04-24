package com.example.m01s09dataspring.repositories;

import com.example.m01s09dataspring.models.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

    List<Servico> findByAtivoTrueOrderByNome();

    Servico findByIdAndAtivoTrue(Integer id);
}
