package com.victorlobato.backendpet.controller;

import com.victorlobato.backendpet.exception.ResourceNotFoundException;
import com.victorlobato.backendpet.model.Pet;
import com.victorlobato.backendpet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/pets/{id}")
    public ResponseEntity<Pet> getPetById(@PathVariable Long id){
        Pet pet = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pet não encontrado com o id = "+ id));
        return ResponseEntity.ok(pet);
    }

    @PutMapping("/pets/{id}")
    public ResponseEntity<Pet> updatePet(@PathVariable Long id, @RequestBody Pet petDetails){
        Pet pet = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pet não encontrado com o id = "+ id));

        pet.setNome(petDetails.getNome());
        pet.setNomeDono(petDetails.getNomeDono());
        pet.setEmailDono(petDetails.getEmailDono());

        Pet updatedPet = repository.save(pet);
        return ResponseEntity.ok(updatedPet);
    }

}
