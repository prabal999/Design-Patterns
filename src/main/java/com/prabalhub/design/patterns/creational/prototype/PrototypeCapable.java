package com.prabalhub.design.patterns.creational.prototype;

/**
 * The prototype pattern is used to instantiate a new object by copying all of the properties of an
 * existing object, creating an independent clone. This practise is particularly useful when the
 * construction of a new object is inefficient.
 * 
 * @author Prabal Srivastava
 */
public interface PrototypeCapable extends Cloneable {

    PrototypeCapable clone() throws CloneNotSupportedException;
}
