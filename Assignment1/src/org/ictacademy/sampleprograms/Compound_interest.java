package org.ictacademy.sampleprograms;
import java.lang.Math;

public class Compound_interest {
	
	public double comp_calc(double p,double r,double t) {
		
		double compound_interest= p*(Math.pow((1+r/100), t));
		return compound_interest;
	}

}
