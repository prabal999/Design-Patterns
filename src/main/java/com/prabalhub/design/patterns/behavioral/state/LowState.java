package com.prabalhub.design.patterns.behavioral.state;

public class LowState implements State {
	private FanContext context;
	
	public LowState(FanContext context) {
		this.context = context;
	}
	@Override
	public void handleRequest() {
		System.out.println("Fan is turring to midium");
		context.setState(context.getMidiumState());
	}

	@Override
	public String toString() {
		return "Fan is low.";
	}
}
