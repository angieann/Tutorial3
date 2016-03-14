/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

import java.util.ArrayList;

interface Cats{
    ArrayList<Kitten> Kittens = new ArrayList<Kitten>();
    //public boolean addKitten(Kitten k);
}

interface Dogs {
    ArrayList<puppy> puppiesList = new ArrayList<puppy>();
}

public class PetDB implements Cats, Dogs 
{
     
   ArrayList<Pet> Pets = new ArrayList<Pet>();
    
   public PetDB(){
   }
     
    
   public boolean addPet(Pet p) throws overStockException{
        
    Pets.add(p);
        
    try{
            if (Pets.size() > 2){
                throw new overStockException();
            }
            else
                return true;
        }catch (overStockException ex){
            throw ex;
        }
    
       
        
    }
    
    public boolean delPet(int id)
    {
        Pets.remove(id);
        return true;
    }
    
    public Pet getPet(int id)
    {
        return Pets.get(id);
    }
    
    public int countPets()
    {
        return Pets.size();
    }
    
    public int countPuppies()
    {
        return puppiesList.size();
    }
    
    public int countKittens()
    {
        return (Pets.size() - puppiesList.size());
    }
    
    public puppy getRandomPuppy(int id)
    {
        return (puppy) puppiesList.get(id);
    }
    
    public Kitten getRandomitten(int id)
    {
        return (Kitten) Kittens.get(id);
    }
}
