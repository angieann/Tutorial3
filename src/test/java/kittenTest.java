/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.examples.one.petstore.Kitten;
import junit.framework.TestCase;
import org.junit.Test;


public class kittenTest{
    
   
   

    @Test
    public void validKitten(){
        Kitten k;
        k = new Kitten(1, "Lana", "Persian");
        
    }
    
    @Test
    public void invalidKitten() throws Exception
    {
        Kitten k;
        k = new Kitten(1, "Lana", "Labrador");
    }
    

    
    
   
    
    //invalid kitten, valid kitten
    
    
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
