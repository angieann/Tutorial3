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
    String[] breed = {"Persian", "Siamese", "Bengal"};
    boolean sensitiveToFeeding;
    
    
    public Kitten(int id, String name, String breed){
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
    
    public void setBreed(String[] breed){
        this.breed = Arrays.copyOf(breed, breed.length);
    }
    
    public String[] getBreed(){
        return Arrays.copyOf(breed, breed.length);
    }
    
 
    public void setSensitiveToFeeding(Boolean sensitiveToFeeding)
    {
        this.sensitiveToFeeding = sensitiveToFeeding;
    }
    
     public Boolean getSensitiveToFeeding(){
        return sensitiveToFeeding;
    }
}
