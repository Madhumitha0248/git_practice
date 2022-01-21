package com.madhu.Ex.constructorinjection.ambiguity;

public class Addition {
	Addition(double a,double b){
		System.out.println("Inside constructor Double");
	}
   Addition(int a,int b){
	   System.out.println("Inside constructor INT");
	   System.out.println(a);
	   System.out.println(b);
   }
   Addition(String a,String b){
	   System.out.println("Inside constructor String");
   }
   
   //ambiguity arises when the order is changed and also string comes first
}
