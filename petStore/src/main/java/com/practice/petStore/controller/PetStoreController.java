package com.practice.petStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.petStore.model.Pet;
import com.practice.petStore.service.PetService;

@RestController
public class PetStoreController {

    @Autowired
    private PetService petService;
    
    
    @GetMapping("/pet")
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }
    
    @PostMapping("/pet")
    public void postPet(@RequestBody Pet pet) {
        petService.addPets(pet);
    }
}
