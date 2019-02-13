package com.example.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {
   private static final long serialVersionUID = -2662774399603335422L;

   private Set<Speciality> specialities = new HashSet<>();

   public Set<Speciality> getSpecialities() {
      return specialities;
   }

   public void setSpecialities(Set<Speciality> specialities) {
      this.specialities = specialities;
   }
}
