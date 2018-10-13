/**
 * 
 */
package com.prabalhub.design.patterns.creational.builder;

/**
 * @author Prabal Srivastava
 *
 */
public class CarBuilderDirector {
	private CarBuilder builder;
	public CarBuilderDirector(final CarBuilder builder) {
		this.builder = builder;
	}
	
	public Car construct() {
		return builder.buildWheels().buildModel().buildColor().build();
	}
}
