// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.example.showup2move.models;

import com.example.showup2move.user_files.models.UserPreferences;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
   name = "sports"
)
public class Sports {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String name;
   private int teamSizeMin;
   private int teamSizeMax;
   @OneToMany(
      mappedBy = "sports",
      fetch = FetchType.EAGER
   )
   private List<UserPreferences> userPreferences = new ArrayList();
   @OneToMany(
      mappedBy = "sports",
      fetch = FetchType.EAGER
   )
   private List<Event> events = new ArrayList();

   public Sports() {
   }

   public Sports(String name, int teamSizeMin, int teamSizeMax) {
      this.name = name;
      this.teamSizeMin = teamSizeMin;
      this.teamSizeMax = teamSizeMax;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getTeamSizeMin() {
      return this.teamSizeMin;
   }

   public void setTeamSizeMin(int teamSizeMin) {
      this.teamSizeMin = teamSizeMin;
   }

   public int getTeamSizeMax() {
      return this.teamSizeMax;
   }

   public void setTeamSizeMax(int teamSizeMax) {
      this.teamSizeMax = teamSizeMax;
   }

   public List<UserPreferences> getUserPreferences() {
      return this.userPreferences;
   }

   public void setUserPreferences(List<UserPreferences> userPreferences) {
      this.userPreferences = userPreferences;
   }

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public List<Event> getEvents() {
      return this.events;
   }

   public void setEvents(List<Event> events) {
      this.events = events;
   }
}
