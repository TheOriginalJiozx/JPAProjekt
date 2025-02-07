package jpa.jpaprojekt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int unicode;
    private char bogstav;
    private String description;

    public Unicode() {}

    public Unicode(int unicode, char bogstav, String description) {
        this.unicode = unicode;
        this.bogstav = bogstav;
        this.description = description;
    }
}