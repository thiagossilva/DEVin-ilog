package tech.devinhouse.copadomundo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tech.devinhouse.copadomundo.models.Selecao;

@Repository
public interface SelecaoRepository extends JpaRepository<Selecao, String> {
}