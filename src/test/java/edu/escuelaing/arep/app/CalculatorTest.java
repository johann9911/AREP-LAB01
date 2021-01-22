package edu.escuelaing.arep.app;

import java.util.HashMap;
import org.junit.Test;
import edu.escuelaing.arep.Calculator.Calculator;
import junit.framework.Assert;


public class CalculatorTest 
{
    Calculator calculator;
    public CalculatorTest()
    {
        
    }

    @Test
    public void testCalcultor(){
    	Calculator calculator = new Calculator();
    	HashMap<String, Double> result =calculator.calculate("./src/test/java/edu/escuelaing/arep/resources/Data1.txt");
        Assert.assertEquals(550.6,result.get("Mean"),0.2);
        Assert.assertEquals(572.03,result.get("Deviation"),0.2);
    }
    @Test
    public void testCalcultor2(){
    	Calculator calculator = new Calculator();
    	HashMap<String, Double> result =calculator.calculate("./src/test/java/edu/escuelaing/arep/resources/Data2.txt");
    	Assert.assertEquals(60.32,result.get("Mean"),0.2);
        Assert.assertEquals(62.26,result.get("Deviation"),0.2);
    }
    @Test
    public void testCalcultor3(){
    	Calculator calculator = new Calculator();
    	HashMap<String, Double> result =calculator.calculate("./src/test/java/edu/escuelaing/arep/resources/Data3.txt");
    	Assert.assertEquals(638.9,result.get("Mean"),0.2);
        Assert.assertEquals(625.63,result.get("Deviation"),0.2);
    }
}
