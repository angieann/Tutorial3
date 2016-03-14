/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.examples.one.petstore.IncorrectBreedException;
import com.examples.one.petstore.overStockException;
import com.examples.one.petstore.notEnoughExerciseExcepetion;
import com.examples.one.petstore.puppy;
import com.examples.one.petstore.puppyDB;
import org.junit.Test;

/**
 *
 * @author userElise
 */
public class puppyTest {
    

    @Test
    public void validPuppy() throws overStockException, IncorrectBreedException{
        puppy p;
        p = new puppy(1, "Fido", "Labrador");
    }
    
    @Test(expected=IncorrectBreedException.class)
    public void invalidPuppy() throws overStockException, IncorrectBreedException{
        puppy p;
        p = new puppy(1, "Lilly", "Ciwawa");
    }
    
    @Test(expected=overStockException.class)
    public void overStockTest() throws overStockException, IncorrectBreedException{
        puppy p = new puppy(1,"haq", "Labrador");
        puppy p1 = new puppy(2, "kif", "Pitbull");
        puppy p2 = new puppy(3, "xbajt", "Pitbull");
        
        puppyDB pdb = new puppyDB();
        
        pdb.addPuppy(p1);
        pdb.addPuppy(p1);
        pdb.addPuppy(p2);
        
    }
    
    @Test(expected = notEnoughExerciseExcepetion.class)
    public void invalidExercise() throws notEnoughExerciseExcepetion, IncorrectBreedException{
        puppy p = new puppy(1,"cutie", "Labrador");
        p.setExercise(9);
        
    }
    
    public void validExercise() throws notEnoughExerciseExcepetion, IncorrectBreedException{
        puppy p = new puppy(1,"cutie", "Labrador");
        p.setExercise(4);
    }
    
}
