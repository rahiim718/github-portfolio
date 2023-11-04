package com.virtualpet.api.homework.assignment.service;

import org.springframework.stereotype.Service;

import com.virtualpet.api.homework.assignment.repository.VirtualPetRepository;
import com.virtualpet.api.homework.assignment.model.VirtualPet;

@Service
public class VirtualPetStorage {
    private VirtualPetRepository petRepo;

    public VirtualPetStorage(VirtualPetRepository petRepo){
        this.petRepo = petRepo;
    }

    public VirtualPet getPetById(Long id){
        return petRepo.findById(id).get();
    }

    public Iterable<VirtualPet> getAllPets(){
        return petRepo.findAll();
    }
    
    public void addPets(VirtualPet pet){
        petRepo.save(pet);
    }

    public void removePet(Long id){
        petRepo.deleteById(id);
    }
}
