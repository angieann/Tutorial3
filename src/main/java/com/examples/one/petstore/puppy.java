/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

import java.util.Arrays;

/**
 *
 * @author userElise
 */
public class puppy {
    
    int id;
    String name;
    String breed ;
    boolean loudBark;
    int[] exerciseRequiredPerDay= {0,1,2,3,4};
    boolean friendlyWithChildren;
    
    public puppy(int id, String name, String breed) throws IncorrectBreedException{
        
        try{
            if(!(breed.equals("Labrador")) & !(breed.equals("Doberman")) & !(breed.equals("Pitbull")))
                throw new IncorrectBreedException();
        }catch(IncorrectBreedException ex){
            throw ex;
        }
        
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public void setExercise(int[] exerciseRequiredPerDay){
        this.exerciseRequiredPerDay = Arrays.copyOf(exerciseRequiredPerDay, exerciseRequiredPerDay.length);
    }
    
    public int[] getExercise(){
        return Arrays.copyOf(exerciseRequiredPerDay, exerciseRequiredPerDay.length);
    }
        
}
