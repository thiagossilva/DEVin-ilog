package tech.devinhouse.exercicios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.devinhouse.exercicios.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    boolean existsByCpfCnpj(String cpfCnpj);

    boolean existsByIdNotAndCpfCnpj(Integer id, String cpfCnpj);
}
