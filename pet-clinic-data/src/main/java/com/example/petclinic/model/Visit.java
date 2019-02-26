package com.example.petclinic.model;

import lombok.*;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

   private static final long serialVersionUID = 5963760232333236055L;

   @Column(name = "date")
   private LocalDate date;
   @Column(name = "description")
   private String description;

   @ManyToOne
   @JoinColumn(name = "pet_id")
   private Pet pet;

}
