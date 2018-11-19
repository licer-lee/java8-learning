package com.licerlee.java8.lambda;

public class PersonTest {
	
	public static void main(String[] args) {

		// 构造器引用
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker");
		System.out.println(person);
	}
}
