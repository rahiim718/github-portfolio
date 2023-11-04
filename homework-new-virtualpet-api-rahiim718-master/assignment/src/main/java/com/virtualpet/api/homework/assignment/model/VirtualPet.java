package com.virtualpet.api.homework.assignment.model;

import javax.persistence.*;

@Entity
public class VirtualPet {
   @Id //Tells the database this is the key for all entries
   @GeneratedValue //Tells the database that you have to generate that value
    
   private Long id; 
    
    private String petName;
    private String description;
    private int boredom;
    private int hunger;
    private int thirst;

    public VirtualPet(){}

    public VirtualPet(String petName, String description, int boredom, int hunger, int thirst){
        this.petName = petName;
        this.description = description;
        this.boredom = boredom;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    

    public Long getId(){
        return id;
    }

    public String getPetName(){
        return petName;
    }

    public String getDescription(){
        return description;
    }
    public int getBoredom(){
        return boredom;
    }

    public int getHunger(){
        return hunger;
    }

    public int getThirst(){
        return thirst;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPetName(String petName){
        this.petName = petName;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    // @Override
    // public String toString() {
    //     return "VirtualPet [petName=" + petName + ", description=" + description + ", boredom=" + boredom + ", hunger="
    //             + hunger + ", thirst=" + thirst + "]";
    // }
    



    // @Override
    // public String toString(){
    //     return "VirtualPet{" +
    //             "petName='" + petName + '\'' +
    //             ", description=" + description +
    //             ", bordom=" + boredom +
    //             ", hunger=" + hunger +
    //             ", thrist" + thirst +
    //             '}';          
    // }
        
}
