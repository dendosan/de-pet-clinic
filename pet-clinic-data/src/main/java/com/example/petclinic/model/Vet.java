package com.example.petclinic.model;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vets")
public class Vet extends Person {
   private static final long serialVersionUID = -2662774399603335422L;

   @Builder.Default
   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(name = "vet_specialities",
   joinColumns = @JoinColumn(name = "vet_id"),
   inverseJoinColumns = @JoinColumn(name = "speciality_id"))
   private Set<Speciality> specialities = new HashSet<>();

}
