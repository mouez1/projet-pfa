package com.gladiators.pi_spring.Services.Interfaces;

import com.gladiators.pi_spring.Entities.Cours;

import java.util.List;

public interface IServiceCours {
   public Cours AddCours(Cours cours);
   List<Cours> retrieveAllCours();
   byte[] getCoursImageById(Long coursId);

   public Cours getCoursById(Long id);

   byte[] getCoursVideoById(Long coursId);

   public void removeCours(Long idCours);

}
