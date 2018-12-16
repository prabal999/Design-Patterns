package com.prabalhub.design.patterns.behavioral.state;

public class OffState implements State {
	private FanContext context;
	
	public OffState(FanContext context) {
		this.context = context;
	}
	@Override
	public void handleRequest() {
		System.out.println("Fan is turring to low");
		context.setState(context.getLowState());
	}

	@Override
	public String toString() {
		return "Fan is off.";
	}
}
