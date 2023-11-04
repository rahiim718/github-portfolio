package com.virtualpet.api.homework.assignment.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.virtualpet.api.homework.assignment.repository.VirtualPetRepository;
import com.virtualpet.api.homework.assignment.model.VirtualPet;

@Component
public class Populator implements CommandLineRunner {

    private VirtualPetRepository petRepo;


    public Populator(VirtualPetRepository petRepo){
        this.petRepo = petRepo;
    }

    @Override
    public void run(String... args) throws Exception{
        //public VirtualPet(String petName, String description)
        VirtualPet harry = new VirtualPet("Harry", "Dog", 10, 10, 15);
        VirtualPet tom = new VirtualPet("Tom", "Cat", 10, 10, 12);
        VirtualPet sam = new VirtualPet("Sam", "Dog", 10, 10, 10);
        VirtualPet hunter = new VirtualPet("Hunter", "Dog", 10, 10, 20);
    
        petRepo.save(harry);
        petRepo.save(tom);
        petRepo.save(sam);
        petRepo.save(hunter);
    
    }


}
