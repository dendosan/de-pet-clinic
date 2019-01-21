package com.example.petclinicdata.services;

import java.util.Set;

import com.example.petclinicdata.model.Pet;

public interface PetService {

   Pet findById(Long id);
   Pet save(Pet pet);
   Set<Pet> findAll();
}
