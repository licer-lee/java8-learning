package com.licerlee.java8.lambda;

// 函数式接口只能有一个抽象方法。(重写Object的方法除外)
@FunctionalInterface
public interface MyInterface {

	void say(String name);
	
	// 重写Object的public方法例外
	@Override
	boolean equals(Object obj);
	
	
//	Object非public方法不能重写
//	Object clone() throws CloneNotSupportedException;
	
	default void m(){
		System.out.println(" This is functional interface default method ");
	}
}
