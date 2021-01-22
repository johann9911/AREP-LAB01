package edu.escuelaing.arep.Calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import edu.escuelaing.arep.Implementation.LinkedList;

public class Calculator {	
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
