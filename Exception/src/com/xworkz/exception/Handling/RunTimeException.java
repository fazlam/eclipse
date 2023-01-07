package com.xworkz.exception.Handling;

import java.lang.annotation.AnnotationTypeMismatchException;

public class RunTimeException {
	
 public	void method1() throws AnnotationTypeMismatchException {
		System.out.println("before Exception.....");
		throw new AnnotationTypeMismatchException(null, "calling");
	
	}
 public	void method2() throws ArithmeticException {
	 System.out.println("before Exception....."); 
	 throw new ArithmeticException();
 }

}
