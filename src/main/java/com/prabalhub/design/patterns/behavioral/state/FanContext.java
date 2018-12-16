package com.prabalhub.design.patterns.behavioral.state;

public class FanContext {
	private State current;
	private State off;
	private State low;
	private State middium;
	private State high;

	public FanContext() {
		off = new OffState(this);
		low = new LowState(this);
		middium = new MidiumState(this);
		high = new HighState(this);
		current = off;
	}
	
	public void pullChain() {
		current.handleRequest();
	}

	public State getLowState() {
		return low;
	}
	
	public State getMidiumState() {
		return middium;
	}

	public State getHighState() {
		return high;
	}

	public State getOffState() {
		return off;
	}
	
	public void setState(State state) {
		current = state;
	}
	
	@Override
	public String toString() {
		return current.toString();
	}
}
