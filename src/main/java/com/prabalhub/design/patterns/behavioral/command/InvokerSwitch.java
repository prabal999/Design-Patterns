package com.prabalhub.design.patterns.behavioral.command;

import java.util.Stack;

/** The Invoker class */
public class InvokerSwitch {
	private Stack<Command> history = new Stack<Command>();

	   public void storeAndExecute(final Command cmd) {
	      this.history.add(cmd); // optional for undo
	      cmd.execute();
	   }
}
