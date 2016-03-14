/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.examples.one.petstore.IncorrectBreedException;
import com.examples.one.petstore.Pet;
import com.examples.one.petstore.PetDB;
import com.examples.one.petstore.notEnoughExerciseExcepetion;
import com.examples.one.petstore.overStockException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PetTest {
    
     @Test
    public void validPet() throws overStockException, IncorrectBreedException{
        Pet p;
        p = new Pet(1, "Fido", "Labrador");
    }
    
    @Test(expected=IncorrectBreedException.class)
    public void invalidPet() throws overStockException, IncorrectBreedException{
        Pet p;
        p = new Pet(1, "Lana", "tiger");
    }
    
    @Test(expected=overStockException.class)
    public void overStockTest() throws overStockException, IncorrectBreedException{
        Pet p = new Pet(1,"Lillu", "Labrador");
        Pet p1 = new Pet(2, "Lana", "Persian");
        Pet p2 = new Pet(3, "Pixie", "Pitbull");
        
        PetDB pdb = new PetDB();
             
        pdb.addPet(p);
        pdb.addPet(p1);
        pdb.addPet(p2);
        
    }
    
    @Test(expected = notEnoughExerciseExcepetion.class)
    public void invalidExercise() throws notEnoughExerciseExcepetion, IncorrectBreedException{
        Pet p = new Pet(1,"cutie", "Labrador");
        p.setExercise(9);
        
    }
    
    public void validExercise() throws notEnoughExerciseExcepetion, IncorrectBreedException{
        Pet p = new Pet(1,"cutie", "Labrador");
        p.setExercise(4);
    }
    
}
