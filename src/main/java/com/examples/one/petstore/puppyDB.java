/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

import java.util.ArrayList;

/**
 *
 * @author userElise
 */
public class puppyDB {
    
    ArrayList puppiesList = new ArrayList<puppy>();
    
    public puppyDB(){
        if (puppiesList.size() > 10){
            throw new overStockException();
        }
    }
    
    public boolean addPuppy(puppy p){
        return false;
    }
    
    public boolean delPuppy(int id){
        return false;
    }
    
    /**
    public puppy getPuppy(int id){
        
     * @return }**/
    
    public int countPuppies(){
        return 0;
    }
    
}
