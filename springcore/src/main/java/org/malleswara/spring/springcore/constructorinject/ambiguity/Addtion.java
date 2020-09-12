package org.malleswara.spring.springcore.constructorinject.ambiguity;

public class Addtion {
	
	
	Addtion(Double a, Double b){
		System.out.println("Inside constructor DOUBLE");
	}
	Addtion(int a, int b){
		System.out.println("Inside constructor INT");
	}
	Addtion(String a, String b){
		System.out.println("Inside constructor String");
	}
	

}
