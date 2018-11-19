package com.licerlee.java8.lambda.internal;

import java.util.Objects;
import java.util.function.Predicate;

// Predicate接口包含了多种默认方法，用于处理复杂的逻辑动词（and, or，negate）
public class PredicatesTest {

	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.length() > 0;

		System.out.println(predicate.test("foo")); // true
		// negate 相反的
		System.out.println(predicate.negate().test("foo")); // false

		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;
		
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		
		Predicate<Object> objnonNull = Objects::nonNull;
		Predicate<Object> objisNull = Objects::isNull;
		
		Object o = new Object();
		System.out.println(objnonNull.test(o));
		
	}

}
