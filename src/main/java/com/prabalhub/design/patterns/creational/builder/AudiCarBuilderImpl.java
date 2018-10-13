/**
 * 
 */
package com.prabalhub.design.patterns.creational.builder;

/**
 * @author Prabal Srivastava
 *
 */
public class AudiCarBuilderImpl implements CarBuilder {
	private Car car;

	public AudiCarBuilderImpl() {
		car = new Car();
	}
	public Car build() {
		return car;
	}

	public CarBuilder buildColor() {
		car.setColor("RED");
		return this;
	}

	public CarBuilder buildWheels() {
		car.setWeeles(4);
		return this;
	}

	public CarBuilder buildModel() {
		car.setModel("2018");
		return this;
	}

}
