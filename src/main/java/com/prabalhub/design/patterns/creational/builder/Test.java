/**
 * 
 */
package com.prabalhub.design.patterns.creational.builder;

/**
 * @author Prabal Srivastava
 *
 */
public class Test {
	public static void main(String... args) {
		CarBuilder audi = new AudiCarBuilderImpl();
		CarBuilder bmw = new BMWCarBuilderImpl();

		CarBuilderDirector audiDirector = new CarBuilderDirector(audi);
		System.out.println(audiDirector.construct());

		CarBuilderDirector bmwDirector = new CarBuilderDirector(bmw);
		System.out.println(bmwDirector.construct());
	}
}
