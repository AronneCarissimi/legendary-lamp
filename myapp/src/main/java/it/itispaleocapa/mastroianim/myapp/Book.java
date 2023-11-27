package it.itispaleocapa.mastroianim.myapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   @Column(nullable = false, unique = false)
   private String title;
   //getter
public Long getId() {
    return id;
}
public String getTitle() {
    return title;
}
    
}
