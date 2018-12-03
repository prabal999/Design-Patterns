package com.prabalhub.design.patterns.behavioral.chain;

public interface Handler {
	
	void addSuccessor(Handler successor);

	void handleRequest(Request request);
}
