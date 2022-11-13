package com.example.m01s09dataspring.services;

import com.example.m01s09dataspring.models.Servico;
import com.example.m01s09dataspring.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {


    @Autowired private ServicoRepository servicoRepository;

    public List<Servico> get() {
        return servicoRepository.findByAtivoTrueOrderByNome();
    }

    public Servico save(Servico servico) {
        return servicoRepository.save(servico);
    }

    public boolean remove(Integer id) {
        try {
            Servico servico = servicoRepository.findByIdAndAtivoTrue(id);
            if (servico == null)
                return false;

            servico.setAtivo(false);
            save(servico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}