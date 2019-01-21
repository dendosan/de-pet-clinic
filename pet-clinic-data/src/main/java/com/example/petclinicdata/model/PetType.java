package com.example.petclinicdata.model;

public class PetType extends BaseEntity {

   private static final long serialVersionUID = -6095589079602052611L;

   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   
}
