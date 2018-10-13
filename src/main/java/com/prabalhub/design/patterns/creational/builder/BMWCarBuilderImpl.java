/**
 * 
 */
package com.prabalhub.design.patterns.creational.builder;

/**
 * @author prabal
 *
 */
public class BMWCarBuilderImpl implements CarBuilder {

	private Car car;
	public BMWCarBuilderImpl() {
		car = new Car();
	}
	/* (non-Javadoc)
	 * @see com.prabalhub.design.patterns.creational.builder.CarBuilder#build()
	 */
	public Car build() {
		return car;
	}

	/* (non-Javadoc)
	 * @see com.prabalhub.design.patterns.creational.builder.CarBuilder#buildColor()
	 */
	public CarBuilder buildColor() {
		car.setColor("BLACK");
		return this;
	}

	/* (non-Javadoc)
	 * @see com.prabalhub.design.patterns.creational.builder.CarBuilder#buildWheels()
	 */
	public CarBuilder buildWheels() {
		car.setWeeles(4);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.prabalhub.design.patterns.creational.builder.CarBuilder#buildModel()
	 */
	public CarBuilder buildModel() {
		car.setModel("Y2K");
		return this;
	}

}
