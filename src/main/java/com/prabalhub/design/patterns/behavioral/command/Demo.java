package com.prabalhub.design.patterns.behavioral.command;

public class Demo {

	public static void main(String[] args) {
		Task task1 = new Task(3, 3); // Encapsulated request
		Task task2 = new Task(6, 6);
		Thread first = new Thread(task1);
		Thread secount = new Thread(task2);
		first.start(); // Invoker
		secount.start();

		String userInput = "ON";
		final Light lamp = new Light();

		final Command switchUp = new FlipUpCommand(lamp);
		final Command switchDown = new FlipDownCommand(lamp);

		final InvokerSwitch mySwitch = new InvokerSwitch();

		switch (userInput) {
		case "ON":
			mySwitch.storeAndExecute(switchUp);
			break;
		case "OFF":
			mySwitch.storeAndExecute(switchDown);
			break;
		default:
			System.err.println("Argument \"ON\" or \"OFF\" is required.");
			System.exit(-1);
		}
	}

}

class Task implements Runnable {

	private int num1;
	private int num2;

	public Task(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() { // execute method
		System.out.println(num1 * num2); // receiver
	}
}