package com.licerlee.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
		int max = 1000000;
		List<String> values = new ArrayList<>(max);
		for (int i = 0; i < max; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}

		long t0 = System.nanoTime();

//		long count = values.stream().sorted().count();
		//parallelStream
//		System.out.println(count);

		values.parallelStream().forEach((s)->{s=s.substring(0, s.length()-1); System.out.println(s);});
		
		long t1 = System.nanoTime();

		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sequential sort took: %d ms", millis));
	}

}
