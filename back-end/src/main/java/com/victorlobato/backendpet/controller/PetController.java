package com.victorlobato.backendpet.controller;

import com.victorlobato.backendpet.model.Pet;
import com.victorlobato.backendpet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PetController {

    @Autowired
    private PetRepository repository;


    @GetMapping("/pets")
    public List<Pet> getAllPets(){
        return repository.findAll();
    }


}
