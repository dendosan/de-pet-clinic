package com.example.petclinic.model;

public class Speciality extends BaseEntity {

   /**
    * 
    */
   private static final long serialVersionUID = 4182462080495955710L;

   private String description;

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}
