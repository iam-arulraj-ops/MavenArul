package com.BaseClass;

public class VariablesClass {

	
	int b = 40;
	
	
		
		public void method1() {
		System.out.println(b);
		b=20;	
		System.out.println(b);

		}
		
		public void method2() {
			System.out.println(b);
		}
		public static void main(String[] args) {
		      VariablesClass vc = new VariablesClass();
		     // vc.method1();
		      vc.method2();
		}
	}

