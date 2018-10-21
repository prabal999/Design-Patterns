package com.prabalhub.design.patterns.structural.facade;
/**
 * Client
 * @author Prabal Srivastava
 *
 */
public class FacadeDemo {

	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
        computer.start();
	}

}
