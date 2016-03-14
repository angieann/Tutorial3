/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.examples.one.petstore.IncorrectBreedException;
import com.examples.one.petstore.Kitten;
import com.examples.one.petstore.KittenDB;
import com.examples.one.petstore.overStockException;
import junit.framework.TestCase;
import org.junit.Test;


public class kittenTest{
    
   
   

    @Test
    public void validKitten() throws IncorrectBreedException{
        Kitten k;
        k = new Kitten(1, "Lana", "Persian");
        
    }
    
    @Test(expected = IncorrectBreedException.class)
    public void invalidKitten() throws overStockException, IncorrectBreedException
    {
        Kitten k;
        k = new Kitten(1, "Lana", "Labrador");
    }
    
    @Test(expected = overStockException.class)
    public void overStockTest() throws overStockException, IncorrectBreedException{
        Kitten k1 = new Kitten(1, "A", "Sengal");
        Kitten k2 = new Kitten(2, "A", "Sengal");
        Kitten k3 = new Kitten(3, "A", "Sengal");
        
        KittenDB kdb = new KittenDB();
        kdb.addKitten(k1);
        kdb.addKitten(k2);
        kdb.addKitten(k3);
        
    }
    

    
    
   
    
    //invalid kitten, valid kitten
    
    
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
