package com.test1;

import com.test2.ExampleC;

public class Test {

	public static void main(String[] args) {

		ExampleA exampleA=new ExampleA();
		
		exampleA.method2(); 
		//exampleA.method1(); Sadece kendi sýnýfýnýn içerisinde kullanýnilir *private
		
		ExampleB exampleB=new ExampleB();
		exampleB.method2(); // extends kalýtým mimarisinden dolayý
		
		
		ExampleC exampleC=new ExampleC();
		
		exampleC.method2();
		exampleC.method3();
		
		
		
	}

}
