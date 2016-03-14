/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

import java.util.ArrayList;


public class KittenDB {
    
    ArrayList<Kitten> Kittens = new ArrayList<Kitten>();
    
    public boolean addKitten(Kitten k){
        return false;
    }
    
    public boolean delKitten(int id)
    {
        return false;
    }
    
    public Kitten getKitten(int id)
    {
        return null;
    }
    
    public int countKittens()
    {
        return Kittens.size();
    }
}
