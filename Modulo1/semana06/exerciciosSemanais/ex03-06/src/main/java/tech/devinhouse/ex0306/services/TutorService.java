package tech.devinhouse.ex0306.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.ex0306.models.Tutor;
import tech.devinhouse.ex0306.repositories.TutorRepository;
import java.util.List;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    public Tutor save(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public List<Tutor> findAll() {
        return tutorRepository.findAll();
    }

    public boolean delete(Integer id) {
        return tutorRepository.delete(id);
    }

}