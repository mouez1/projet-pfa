package com.gladiators.pi_spring.Repositories;

import com.gladiators.pi_spring.Entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CoursRespository extends JpaRepository<Cours,Long> {
}
