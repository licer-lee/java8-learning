package com.licerlee.java8.lambda;

public class ConverterTest {

	public static void main(String[] args) {

		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted);

		// 静态方法引用
		converter = Integer::valueOf;
		converted = converter.convert("123");
		System.out.println(converted);
		
		// 对象方法引用
		Something something = new Something();
		Converter<String, String> converter1 = something::startsWith;
		String converted1 = converter1.convert("Java");
		System.out.println(converted1);    // "J"
	}
}

class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}
