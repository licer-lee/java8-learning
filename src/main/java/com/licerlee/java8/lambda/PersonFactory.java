package com.licerlee.java8.lambda;

public interface PersonFactory<P extends Person> {

	P create(String name, String lastname);
}
