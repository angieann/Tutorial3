/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.examples.one.petstore.IncorrectBreedException;
import com.examples.one.petstore.overStockException;
import com.examples.one.petstore.puppy;
import org.junit.Test;

/**
 *
 * @author userElise
 */
public class puppyTest{
    

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
    
}
