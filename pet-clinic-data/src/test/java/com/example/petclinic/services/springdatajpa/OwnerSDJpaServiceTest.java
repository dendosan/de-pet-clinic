package com.example.petclinic.services.springdatajpa;

import com.example.petclinic.model.Owner;
import com.example.petclinic.repositories.OwnerRepository;
import com.example.petclinic.repositories.PetRepository;
import com.example.petclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

   @Mock
   OwnerRepository ownerRepository;
   @Mock
   PetRepository petRepository;
   @Mock
   PetTypeRepository petTypeRepository;

   @InjectMocks
   OwnerSDJpaService service;

   @Test
   void findAll() {
   }

   @Test
   void findById() {
   }

   @Test
   void save() {
   }

   @Test
   void delete() {
   }

   @Test
   void deleteById() {
   }

   @Test
   void findByLastName() {
      Owner smith = service.findByLastName("Smith");
   }
}