package com.example.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

   public Person(Long id, String firstName, String lastName) {
      super(id);
      this.firstName = firstName;
      this.lastName = lastName;
   }

   private static final long serialVersionUID = -3697289491245970115L;

   @Column(name = "first_name")
   private String firstName;
   @Column(name = "last_name")
   private String lastName;

}
