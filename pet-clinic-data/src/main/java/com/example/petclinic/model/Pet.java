package com.example.petclinic.model;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

   private static final long serialVersionUID = -5353136125726633184L;

   @Column(name = "name")
   private String name;

   @ManyToOne
   @JoinColumn(name = "type_id")
   private PetType petType;

   @ManyToOne
   @JoinColumn(name = "owner_id")
   private Owner owner;

   @Column(name = "birth_date")
   private LocalDate birthDate;

   @Builder.Default
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
   private Set<Visit> visits = new HashSet<>();

}
