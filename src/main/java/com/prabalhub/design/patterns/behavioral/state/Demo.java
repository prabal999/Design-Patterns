package com.prabalhub.design.patterns.behavioral.state;

public class Demo {

	public static void main(String[] args) {
		FanContext fan = new FanContext();
		
		System.out.println(fan);
		fan.pullChain();

		System.out.println(fan);
		fan.pullChain();

		System.out.println(fan);
		fan.pullChain();

		System.out.println(fan);
		fan.pullChain();

	}

}
