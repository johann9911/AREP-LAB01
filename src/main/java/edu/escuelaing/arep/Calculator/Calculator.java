package edu.escuelaing.arep.Calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import edu.escuelaing.arep.Implementation.LinkedList;


/**
 * This program works like a calculator to obtain
 * the mean and deviation of a amount N of data, 
 * using a linked list that is implemented by the programmer
 * @author Johann Bogotá
 *
 */
public class Calculator {	
	
	/**
	 * This method is used to calculate the mean and deviation
	 * @param path This a String that containing N numbers
	 * @return This returns the result in a Hashmap with the key Mean and deviation.
	 */
	public HashMap<String,Double> calculate(String path){
		LinkedList list = new LinkedList();
		HashMap<String,Double> result = new HashMap<String, Double>();
	    BufferedReader br ;
	    try {
	        br = new BufferedReader(new FileReader(path));
	        String line;
	        while ((line = br.readLine()) != null) {
	        	list.push(Double.parseDouble(line));
	        }
	        br.close();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    result.put("Mean",mean(list));
	    result.put("Deviation",deviation(list,result.get("Mean")));
	    return result;
	}
	 
	/**
	 * This method is used to calculate the mean of a list of numbers
	 * @param list This a list with N numbers
	 * @return This returns a Double that is a mean of list
	 */
	private Double mean(LinkedList list){
	    Double val = 0.0;
	    int i;
	    for(i=0;i<list.size();i++){
	    	val+=(Double) list.get(i);
	    }
	    val = val/list.size();
	    return val;
	}


	private Double deviation(LinkedList list, Double mean){
	    Double ans = 0.0;
	    int i;
	    for (i = 0; i < list.size(); i++)
	    {
	    	ans+=Math.pow(((Double) list.get(i)-mean),2);
	    }
	    ans = Math.sqrt(ans/(list.size()-1));
	    return ans;
	}

}
