package com.example.petclinicdata.services;

import java.util.Set;

import com.example.petclinicdata.model.Vet;

public interface VetService {

   Vet findById(Long id);
   Vet save(Vet vet);
   Set<Vet> findAll();
}
