package com.example.showup2move.controller;

import com.example.showup2move.models.Sports;
import com.example.showup2move.repository.SportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SportsController {
   @Autowired
   private SportsRepository sportsRepository;

   public SportsController() {
   }

   public boolean sportExists(String name) {
      return this.sportsRepository.findByName(name) != null;
   }

   public void addSport(String name, int teamSizeMin, int teamSizeMax) {
      if (!this.sportExists(name)) {
         this.sportsRepository.save(new Sports(name, teamSizeMin, teamSizeMax));
      }

   }
}
