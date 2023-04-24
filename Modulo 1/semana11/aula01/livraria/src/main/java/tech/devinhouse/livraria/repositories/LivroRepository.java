package tech.devinhouse.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.devinhouse.livraria.models.Livro;

import java.util.Optional;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

    Optional<Livro> findByIsbn(String isbn);

}
