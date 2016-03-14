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
    String[] breed ={"Labrador","Doberman", "Pitbull"} ;
    boolean loudBark;
    int[] exerciseRequiredPerDay= {0,1,2,3,4};
    boolean friendlyWithChildren;
    
    public puppy(int id, String name, String breed){
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
    
}
