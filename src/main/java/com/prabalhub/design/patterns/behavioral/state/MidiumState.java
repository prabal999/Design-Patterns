package com.prabalhub.design.patterns.behavioral.state;

public class MidiumState implements State {
	private FanContext context;

	public MidiumState(FanContext context) {
		this.context = context;
	}

	@Override
	public void handleRequest() {
		System.out.println("Fan is turring to high");
		context.setState(context.getHighState());
	}

	@Override
	public String toString() {
		return "Fan is middum.";
	}
}
