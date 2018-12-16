package com.prabalhub.design.patterns.behavioral.state;

public class HighState implements State {
	private FanContext context;

	public HighState(FanContext context) {
		this.context = context;
	}

	@Override
	public void handleRequest() {
		System.out.println("Fan is turring to off");
		context.setState(context.getOffState());
	}

	@Override
	public String toString() {
		return "Fan is high.";
	}

}
