package com.prabalhub.design.patterns.creational.builder;

import java.io.Serializable;

/**
 * Represents the product created by the builder.
 * @author Prabal Srivastava
 */
public class Car implements Serializable {
	private static final long serialVersionUID = -7933940246337669927L;
	private int weeles;
	private String color;
	private String model;

	/**
	 * @return the weeles
	 */
	public int getWeeles() {
		return weeles;
	}

	/**
	 * @param weeles the weeles to set
	 */
	public void setWeeles(int weeles) {
		this.weeles = weeles;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [weeles=" + weeles + ", color=" + color + ", model=" + model + "]";
	}

}
