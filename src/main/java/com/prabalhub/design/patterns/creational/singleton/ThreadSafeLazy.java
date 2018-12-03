package com.prabalhub.design.patterns.creational.singleton;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * In lazy initialization, class in initialized only when it is required. It can
 * save you from instantiating the class when you don’t need it. Generally lazy
 * initialization is used when we create a singleton class.
 * 
 * @author Prabal Srivastava
 *
 */
//Marking class final: So the child class cannot clone it.
// default constructor is private and no other constructor is there, thats why class can't be extended.
final public class ThreadSafeLazy implements Serializable {

	// Serial version ID for object deserialization.
	private static final long serialVersionUID = -1007406750793642211L;

	// For logging messages.
	private static final Logger log = Logger.getLogger(BillPughLazy.class.getName());

	// volatile : The value of this variable will never be cached thread-locally:
	// all reads and writes will go straight to "main memory".
	private static volatile ThreadSafeLazy instance;

	// Warning message while using reflection.
	private static final String WARNING_MESSAGE = "This class does not support more then one object";

	/**
	 * Making default constructor as private, so that object cannot created by using
	 * "new" operator.
	 */
	private ThreadSafeLazy() {
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
	 * Return the object of {@code ThreadSafeLazy} class.
	 * 
	 * @return {@code ThreadSafeLazy}
	 */
	public static ThreadSafeLazy getInstance() {
		if (null == instance) {
			synchronized (ThreadSafeLazy.class) {
				if (null == instance) {
					instance = new ThreadSafeLazy();
				}
			}
		}
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
	 * stop cloning. NOTE: As class is final so commenting bellow code.
	 */
	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { throw
	 * new CloneNotSupportedException(WARNING_MESSAGE); }
	 */
}
