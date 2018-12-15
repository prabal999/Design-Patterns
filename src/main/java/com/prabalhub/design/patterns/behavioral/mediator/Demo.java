package com.prabalhub.design.patterns.behavioral.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class Demo {

	private Timer timer;
	public Demo(final int secounds) {
		timer = new Timer(); // mediator
		timer.schedule(new Alarm(), 1000 * secounds);
		timer.schedule(new FinalAlarm(), 1000 * 2 * secounds);
	}
	class Alarm extends TimerTask{ // colleague #1
		@Override
		public void run() {
			System.out.println("Time up!");
		}
	}
	class FinalAlarm extends TimerTask{ // colleague #2
		@Override
		public void run() {
			System.out.println("Really time up!");
			timer.cancel();
		}
	}
	public static void main(String[] args) {
		System.out.println("About to schedule the task");
		new Demo(3);
		System.out.println("Task secheduled");
		
		ATCMediator atc = new ATCMediatorImpl();
		FlightColleague airIndia = new FlightColleague(atc);
		RunwayColleague runway = new RunwayColleague(atc);
		airIndia.land(); // not able to land
		runway.land(); // grant the permeation
		airIndia.land(); // landed
	}

}
