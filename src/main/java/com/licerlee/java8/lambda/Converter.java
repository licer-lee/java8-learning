package com.licerlee.java8.lambda;

public interface Converter<F, T> {
	T convert(F from);
}
