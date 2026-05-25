package com.example.showup2move.models;

import com.example.showup2move.user_files.models.UserEvents;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
   name = "events"
)
public class Event {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String name;
   private int size;
   @OneToMany(
      mappedBy = "event",
      fetch = FetchType.EAGER
   )
   private List<UserEvents> userEvents = new ArrayList();
   @ManyToOne
   @JoinColumn(
      name = "sport_id",
      referencedColumnName = "id"
   )
   private Sports sports;

   public Event() {
   }

   public Event(String name, int size, Sports sports) {
      this.name = name;
      this.size = size;
      this.sports = sports;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getSize() {
      return this.size;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public List<UserEvents> getUserEvents() {
      return this.userEvents;
   }

   public void setUserEvents(List<UserEvents> userEvents) {
      this.userEvents = userEvents;
   }

   public Sports getSports() {
      return this.sports;
   }

   public void setSports(Sports sports) {
      this.sports = sports;
   }
}
