package com.licerlee.java8.jar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.JarOutputStream;

public class Test {

	public static void main(String[] args) {

		FileOutputStream out;
		try {
			out = new FileOutputStream(new File("d:\\my.jar"));
			JarOutputStream jarOutputStream = new JarOutputStream(out);
			jarOutputStream.write("helloJar".getBytes());
			out.close();
			jarOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
