package com.licerlee.java8.interfacedefault;

// 公式 接口
public class FormulaTest {

	public static void main(String[] args) {

		Formula formula = new Formula() {

			@Override
			public double calculate(int a) {
				return a * 10;
			}
		};

		double r1 = formula.calculate(32);
		System.out.println("r1 = " + r1);
		double r2 = formula.sqrt(4);
		System.out.println("r2 = " + r2);

	}
}
