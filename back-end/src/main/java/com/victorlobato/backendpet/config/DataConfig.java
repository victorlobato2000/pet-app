package com.victorlobato.backendpet.config;

import com.victorlobato.backendpet.model.Pet;
import com.victorlobato.backendpet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataConfig {

    @Autowired
    private PetRepository repository;

    @Bean
    public void criarPets(){
        List<Pet> pets = new ArrayList<>(){{
           add(new Pet("Mingau","Victor", "vitu@gmail.com"));
           add(new Pet("Lambe-lambe","Maria", "maria123@gmail.com"));
           add(new Pet("Karol","Paulinha", "paulinha_23@gmail.com"));
        }};
        repository.saveAll(pets);
    }
}
