package com.epam.spring.homework1.pet;

import com.epam.spring.homework1.interfaces.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {
    private final List<Animal> pets;

    public Pet(List<Animal> pets) {
        this.pets = pets;
    }

    public void printPets() {
        for (Animal animal : pets) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }

}
