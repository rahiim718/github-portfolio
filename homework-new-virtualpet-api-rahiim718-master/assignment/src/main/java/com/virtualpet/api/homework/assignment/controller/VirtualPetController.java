package com.virtualpet.api.homework.assignment.controller;

import org.h2.engine.Mode;
import org.springframework.stereotype.Controller;
// import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.virtualpet.api.homework.assignment.service.VirtualPetStorage;
import com.virtualpet.api.homework.assignment.model.VirtualPet;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.dao.EmptyResultDataAccessException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class VirtualPetController {
    private VirtualPetStorage petStorage;

    public VirtualPetController(VirtualPetStorage petRepo){
        this.petStorage = petRepo;
    }

    @GetMapping("/home")
    public String home(Model page){
        page.addAttribute("allPets", petStorage.getAllPets());
        return "index";
    }

    @PostMapping("/modPet")
    public String modPet(Model model){
        return "addpet.html";
    }


    
    @PostMapping("/home")
    public String addPets(
        @RequestParam String petName,
        @RequestParam String description,
        @RequestParam int boredom,
        @RequestParam int hunger,
        @RequestParam int thirst,
        Model model)
        {
            
            if(petName.isBlank() || description.isBlank() || boredom == 0 || hunger == 0 || thirst == 0){
                model.addAttribute("invalidInfo", "Please enter all info to add pet, including numbers above zero.");
                return"errorAddPet.html";            
            }
        
            VirtualPet pet = new VirtualPet();
            pet.setPetName(petName);
            pet.setDescription(description);
            pet.setBoredom(boredom);
            pet.setHunger(hunger);
            pet.setThirst(thirst);
            petStorage.addPets(pet);
            model.addAttribute("allPets", petStorage.getAllPets());
            return "index.html";

        }
    
    @PostMapping("/delete")
    public String removePet(
        @RequestParam Long id, Model model

    )
    {   
        petStorage.removePet(id);
        model.addAttribute("allPets", petStorage.getAllPets());    
        return "index.html";
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public String errorOnDelete(HttpServletRequest request, Exception ex, Model page){
        String invalidId = request.getParameter("id");
        page.addAttribute("invalidId", invalidId);
        return "errorID.html";
    }

    }
