package com.example.petclinicdata.services.map;

import java.util.Set;

import com.example.petclinicdata.model.Pet;
import com.example.petclinicdata.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

   @Override
   public Set<Pet> findAll() {
      return super.findAll();
   }

   @Override
   public Pet findById(Long id) {
      return super.findById(id);
   }

   @Override
   public Pet save(Pet object) {
      return super.save(object.getId(), object);
   }

   @Override
   public void delete(Pet object) {
     super.delete(object); 
   }

   @Override
   public void deleteById(Long id) {
     super.deleteById(id); 
   }

}
