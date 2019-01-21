package com.example.petclinicdata.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

   private static final long serialVersionUID = -4626827386785433604L;

   private Long id;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   
}
