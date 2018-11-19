package com.licerlee.java8.interfacedefault;

// 公式 接口
public interface Formula {

	double calculate(int a);

	// 开方计算
	default double sqrt(int a) {
		return Math.sqrt(a);
	}

}
