/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

import java.util.Arrays;


public class Kitten {
    int id;
    String name;
    String breed; 
    boolean sensitiveToFeeding;
    
    
    public Kitten(int id, String name, String breed) throws IncorrectBreedException {
        try{
            if (!(breed.equals("Persian"))& !(breed.equals("Siamese")) & !(breed.equals("Sengal")))
            {
                throw  new IncorrectBreedException();
            }
        }catch(IncorrectBreedException ex){
                    throw ex;
                    }
        
        }
    

    public Kitten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
 
    public void setSensitiveToFeeding(Boolean sensitiveToFeeding)
    {
        this.sensitiveToFeeding = sensitiveToFeeding;
    }
    
     public Boolean getSensitiveToFeeding(){
        return sensitiveToFeeding;
    }
}
