package com.prabalhub.design.patterns.creational.singleton;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * In eager initialization, the instance of Singleton Class is created at the
 * time of class loading, this is the easiest method to create a singleton class
 * but it has a drawback that instance is created even though client application
 * might not be using it.
 * 
 * @author Prabal Srivastava
 *
 */
//Marking class final: So the child class cannot clone it.
public final class Eager implements Serializable {

	// Serial version ID for object deserialization.
	private static final long serialVersionUID = -6689563369948930442L;

	// For logging messages.
	private static final Logger log = Logger.getLogger(Eager.class.getName());

	// Eagerly created object.
	private static final Eager instance = new Eager();

	// Warning message while using reflection.
	private static final String WARNING_MESSAGE = "This class does not support more then one object";

	/**
	 * Making default constructor as private, so that object cannot created by using
	 * "new" operator.
	 */
	private Eager() {
		if (null != instance) {
			try {
				// throw exception if reflection is used to create more then one object.
				throw new IllegalAccessException(WARNING_MESSAGE);
			} catch (IllegalAccessException e) {
				log.log(Level.WARNING, e.getMessage());
			}
		}
	}

	/**
	 * Return the object of {@code Eager} class.
	 * 
	 * @return {@code Eager}
	 */
	public static Eager getInstance() {
		return instance;
	}

	/**
	 * Make sure that only one copy of object will be there after deserialization.
	 * 
	 * @return {@code Object}
	 */
	protected Object readResolve() {
		return getInstance();
	}

	/**
	 * If class is not final then child can clone it. So override clone method to
	 * stop cloning.
	 * NOTE: As class is final so commenting bellow code.
	 */
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException(WARNING_MESSAGE);
	}*/

}
