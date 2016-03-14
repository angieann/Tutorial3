/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

import java.util.ArrayList;


public class KittenDB {
    
    ArrayList<Kitten> Kittens = new ArrayList<Kitten>();
    
   public KittenDB() throws overStockException{
        
        try{
            if (Kittens.size() > 10){
                throw new overStockException();
            }
        }catch (overStockException ex){
            throw ex;
        }
    }
    
    public boolean addKitten(Kitten k){
        
        // if kitten is greater than 10, throw exception
        
        Kittens.add(k);
        
        return true;
        
    }
    
    public boolean delKitten(int id)
    {
        Kittens.remove(id);
        return true;
    }
    
    public Kitten getKitten(int id)
    {
        return Kittens.get(id);
    }
    
    public int countKittens()
    {
        return Kittens.size();
    }
}
