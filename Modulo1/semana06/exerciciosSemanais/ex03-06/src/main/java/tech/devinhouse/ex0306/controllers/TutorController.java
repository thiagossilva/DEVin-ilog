package tech.devinhouse.ex0306.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.ex0306.models.Tutor;
import tech.devinhouse.ex0306.services.TutorService;

import java.util.List;

@RestController
@RequestMapping(value = "tutor")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @GetMapping
    public List<Tutor> get() {
        return tutorService.findAll();
    }

    @PostMapping
    public Tutor post(@RequestBody Tutor tutor) {
        return tutorService.save(tutor);
    }

    @PutMapping
    public Tutor put(@RequestBody Tutor tutor) {
        return tutorService.save(tutor);
    }

    @DeleteMapping
    public boolean delete(Integer id) {
        return tutorService.delete(id);
    }

}
