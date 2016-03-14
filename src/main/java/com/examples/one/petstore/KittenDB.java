/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

import java.util.ArrayList;
import com.examples.one.petstore.overStockException;


public class KittenDB {
    
    ArrayList<Kitten> Kittens = new ArrayList<Kitten>();
    
   public KittenDB(){
   }
     
    
    public boolean addKitten(Kitten k) throws overStockException{
        
    Kittens.add(k);
        
    try{
            if (Kittens.size() > 2){
                throw new overStockException();
            }
            else
                return true;
        }catch (overStockException ex){
            throw ex;
        }
    
       
        
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
