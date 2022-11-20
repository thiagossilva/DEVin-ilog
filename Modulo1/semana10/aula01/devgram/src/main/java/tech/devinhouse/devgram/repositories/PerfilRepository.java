package tech.devinhouse.devgram.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.devgram.models.Perfil;
import tech.devinhouse.devgram.models.Status;
import java.util.List;
@Repository
public interface PerfilRepository extends JpaRepository<Perfil, String> {
    List<Perfil> findByStatus(Status status);
}

