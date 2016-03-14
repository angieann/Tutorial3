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
    int exerciseRequiredPerDay;
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
    
    public void setExercise(int exerciseRequiredPerDay) throws notEnoughExerciseExcepetion{
        this.exerciseRequiredPerDay = exerciseRequiredPerDay;
        try{
            if (exerciseRequiredPerDay<0 | exerciseRequiredPerDay>4)
                throw new notEnoughExerciseExcepetion();
        }catch(notEnoughExerciseExcepetion ex){
            throw ex;
        }
    }
    
    public int getExercise(){
        return exerciseRequiredPerDay;
    }
        
}
