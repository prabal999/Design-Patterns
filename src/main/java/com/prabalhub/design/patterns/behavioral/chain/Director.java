package com.prabalhub.design.patterns.behavioral.chain;

public class Director implements Handler {

	private Handler successor;

	public void addSuccessor(Handler successor) {
		this.successor = successor;
	}

	public void handleRequest(Request request) {
		if (request.getAmount() < 1000) {
			System.out.println("Director can handle/approve:" + request);
		} else if (null != successor) {
			successor.handleRequest(request);
		}
	}

}
