package com.licerlee.java8.lambda;

public class MyInterfaceTest {

	public static void main(String[] args) {
		
		MyInterface mi = (String name)->{System.out.println("Welcome: "+ name);};
		mi.say("licerlee");
		
		// 使用静态引用
		MyInterface mi2 = System.out::println;
		mi2.say("licerlee");
		
	}
}

