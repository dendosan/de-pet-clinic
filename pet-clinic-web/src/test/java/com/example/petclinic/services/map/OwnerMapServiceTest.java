package com.example.petclinic.services.map;

import com.example.petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

   OwnerMapService ownerMapService;

   final Long ownerId = 1L;
   final String ownerLastName = "Smith";

   @BeforeEach
   void setUp() {
      ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

      ownerMapService.save(Owner.builder().id(1L).lastName(ownerLastName).build());
   }

   @Test
   void findAll() {
      Set<Owner> ownerSet =  ownerMapService.findAll();

      assertEquals(1L, ownerSet.size());
   }

   @Test
   void findById() {
      Owner owner = ownerMapService.findById(ownerId);

      assertEquals(ownerId, owner.getId());
   }

   @Test
   void saveExistingId() {
      Long id = 2L;
      Owner owner2 = Owner.builder().id(id).build();
      Owner savedOwner = ownerMapService.save(owner2);

      assertEquals(id, savedOwner.getId());
   }

   @Test
   void saveNoId() {
      Owner savedOwner = ownerMapService.save(Owner.builder().build());

      assertNotNull(savedOwner);
   }

   @Test
   void delete() {
      ownerMapService.delete(ownerMapService.findById(ownerId));

      assertEquals(0L, ownerMapService.findAll().size());
   }

   @Test
   void deleteById() {
      ownerMapService.deleteById(ownerId);

      assertEquals(0L, ownerMapService.findAll().size());
   }

   @Test
   void findByLastNameNotFound() {
      Owner o = ownerMapService.findByLastName("foo");

      assertNull(o);
   }

   @Test
   void findByLastName() {
      Owner o = ownerMapService.findByLastName(ownerLastName);

      assertNotNull(o);

      assertEquals(ownerId, o.getId());
   }
}