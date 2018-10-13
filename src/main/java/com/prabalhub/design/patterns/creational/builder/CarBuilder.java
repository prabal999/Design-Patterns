package com.prabalhub.design.patterns.creational.builder;

/**
 * The builder abstraction.
 * 
 * @author Prabal Srivastava
 */
public interface CarBuilder {
	
	Car build();

	CarBuilder buildColor();

	CarBuilder buildWheels();

	CarBuilder buildModel();
}
