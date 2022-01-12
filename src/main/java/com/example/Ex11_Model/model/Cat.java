package com.example.Ex11_Model.model;

import javax.persistence.*;

@Entity
@Table(name="Cat9")
public class Cat {

    @Id
    @SequenceGenerator(
            name = "cat_sequence",
            sequenceName = "cat_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cat_sequence"
    )
    private int id;
    private String name;

    public Cat() {
    }

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
