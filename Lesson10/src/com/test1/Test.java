package com.test1;

import com.test2.ExampleC;

public class Test {

	public static void main(String[] args) {

		ExampleA exampleA=new ExampleA();
		
		exampleA.method2(); 
		//exampleA.method1(); Sadece kendi s�n�f�n�n i�erisinde kullan�nilir *private
		
		ExampleB exampleB=new ExampleB();
		exampleB.method2(); // extends kal�t�m mimarisinden dolay�
		
		
		ExampleC exampleC=new ExampleC();
		
		exampleC.method2();
		exampleC.method3();
		
		
		
	}

}
