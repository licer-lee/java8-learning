package com.licerlee.java8.utils;

import java.util.Objects;
import java.util.function.Predicate;

public abstract class ObjectUtils {

	/**
	 * 判断对象是否为空
	 * 
	 * @param obj
	 * @return
	 */
	public static final boolean isNull(Object obj) {

		Predicate<Object> isNull = Objects::isNull;
		return isNull.test(obj);
	}
	
	public static final boolean isNull(String obj) {

		Predicate<String> isNull = Objects::isNull;
		return isNull.test(obj);
	}
	

	public static void main(String[] args) {
		String a = null;
		System.out.println(ObjectUtils.isNull(a));

	}
}
