package com.example.petclinicdata.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

   private static final long serialVersionUID = -5353136125726633184L;

   private PetType petType;
   private Owner owner;
   private LocalDate birthDate;

   public PetType getPetType() {
      return petType;
   }
   public void setPetType(PetType petType) {
      this.petType = petType;
   }
   public Owner getOwner() {
      return owner;
   }
   public void setOwner(Owner owner) {
      this.owner = owner;
   }
   public LocalDate getBirthDate() {
      return birthDate;
   }
   public void setBirthDate(LocalDate birthDate) {
      this.birthDate = birthDate;
   }
   
}
