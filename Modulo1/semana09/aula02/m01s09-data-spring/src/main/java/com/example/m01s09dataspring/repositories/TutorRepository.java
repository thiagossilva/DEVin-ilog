package com.example.m01s09dataspring.repositories;

import com.example.m01s09dataspring.models.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Integer> {
}
