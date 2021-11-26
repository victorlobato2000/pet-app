package com.victorlobato.backendpet.controller;

import com.victorlobato.backendpet.model.Pet;
import com.victorlobato.backendpet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class PetController {

    @Autowired
    private PetRepository repository;

    @GetMapping("/pets")
    public List<Pet> getAllPets(){
        return repository.findAll();
    }

    @PostMapping("/pets")
    public Pet create(@RequestBody Pet pet){
        return repository.save(pet);
    }


}
