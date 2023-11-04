package com.virtualpet.api.homework.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtualpet.api.homework.assignment.model.VirtualPet;

@Repository
public interface VirtualPetRepository extends CrudRepository<VirtualPet, Long> {
    
}
